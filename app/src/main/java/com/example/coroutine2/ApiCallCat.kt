package com.example.coroutine2

import retrofit2.Response
import retrofit2.http.GET

interface ApiCallCat {
    @GET("v1/images/search")
    suspend fun getCat(): Response<List<ResponseCat>>
}