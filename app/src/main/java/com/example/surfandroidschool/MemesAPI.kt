package com.example.surfandroidschool

import com.example.surfandroidschool.Login.MemeDto
import com.example.surfandroidschool.Login.UserInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface MemesAPI {
    @GET("/memes")
    fun getMemes(): Call<MemeDto>
}
