package com.example.surfandroidschool

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

public interface UserAPI {
    @GET("/auth/login")
    fun search(@Query("q") query: String,
               @Query("page") page: Int,
               @Query("per_page") perPage: Int): Observable<Result>
}
