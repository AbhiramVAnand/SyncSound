package com.abhiram.common

import com.abhiram.common.creds.AppwriteCreds
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


}