package com.abhiram.common.AppWrite

class AppwriteCreds {
    private lateinit var key : String
    private lateinit var project : String
    private lateinit var endpoint : String

    init{
        key = "4d495d09695783a197513d77c58eb18db87e6b521b8167127f593aa75452cb09f9cfeff45a0b6f54395f8879d14f97e989adbf1b293b9f09f1fbc073bba4225dcd7e646a120a7df39079ccd35402a09f9cadf7863e4ac4a69f0e9d893ce5d66252e3e11fca319f06967cf047a75ed0141f67810cd8065a6de7c4e00693ce7454"
        project = "654ba32c7ad65af6de9a"
        endpoint = "https://cloud.appwrite.io/v1"
    }
    fun getEndpoint() : String{
        return this.endpoint
    }
    fun getKey() : String{
        return this.key
    }
    fun getProject() : String{
        return this.project
    }
}