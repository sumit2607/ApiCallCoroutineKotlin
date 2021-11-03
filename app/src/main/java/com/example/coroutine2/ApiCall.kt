package com.example.coroutine2
import retrofit2.Response
import retrofit2.http.GET

interface ApiCall {
    @GET("api/breeds/image/random")
    suspend fun getDog():Response<ResponseDog>
    @GET("v1/images/search")
    suspend fun getCat(): Response<List<ResponseCat>>
}