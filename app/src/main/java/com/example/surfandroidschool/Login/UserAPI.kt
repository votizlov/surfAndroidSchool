package com.example.surfandroidschool.Login

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

public interface UserAPI {
    @GET("/auth/login")
    fun search(@Query("phone") phone:Int,
               @Query("pass") pass:String):Boolean<Result>
    )
}
