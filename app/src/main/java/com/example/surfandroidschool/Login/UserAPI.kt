package com.example.surfandroidschool.Login

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

public interface UserAPI {
    @POST("/auth/login")
    fun search(@Body user: User): Call<AuthInfoDto>
}
