package com.example.coroutine2

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ResponseDog(

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: String? = null
)