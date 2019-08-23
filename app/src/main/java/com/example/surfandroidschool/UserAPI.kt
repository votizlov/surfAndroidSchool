package com.example.surfandroidschool

import retrofit2.http.Body
import retrofit2.http.POST

public interface UserAPI {
    @POST("/auth/login")
    Call<User> postUser(@Body User user)
}
