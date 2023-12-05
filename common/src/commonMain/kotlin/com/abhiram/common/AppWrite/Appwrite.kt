package com.abhiram.common.AppWrite

import com.abhiram.common.AppWrite.AppwriteCreds
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.services.Users

class Appwrite {
    var client : Client


    init {
        var creds = AppwriteCreds()
        client = Client(creds.getEndpoint())
            .setKey(creds.getKey())
            .setProject(creds.getProject())
            .setSelfSigned(true)

    }
    suspend fun upload(mail : String){
        val users = Users(this.client)
        val user = users.create(
            userId = ID.unique(),
            email = mail,
            password = "qwerty123"
        )
    }

    //TODO Create functions and qr code generators

}