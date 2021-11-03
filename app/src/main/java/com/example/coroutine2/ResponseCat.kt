package com.example.coroutine2

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ResponseCat(

    @field:SerializedName("width")
    val width: Int? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("breeds")
    val breeds: List<Any?>? = null,

    @field:SerializedName("height")
    val height: Int? = null
)