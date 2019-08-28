package com.example.surfandroidschool.Login

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface UserAPI {
    @GET("/auth/login")
    fun search(@Query("phone") phone:String,
               @Query("pass") pass:String):Call<UserInfo>
}
