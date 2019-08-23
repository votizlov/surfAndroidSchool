package com.example.surfandroidschool

import com.example.surfandroidschool.Login.UserAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public object NetworkService {
    private final val BASE_URL = "http://demo3161256.mockable.io/"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    fun createUserAPI(): UserAPI {
        return retrofit.create(UserAPI::class.java)
    }
    fun createMemesAPI():MemesApi{
        return retrofit.create(MemesApi::class.java)
    }
}