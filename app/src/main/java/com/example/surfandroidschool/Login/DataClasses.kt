package com.example.surfandroidschool.Login

data class User(val phone:Int,val pass:String)
data class AuthInfoDto(val accessToken:String,val userInfo: UserInfo)
data class UserInfo(val id:Int,
val username:	String,
val firstName:	String,
val lastName:	String,
val userDescription: String)
data class ErrorResponseDto(
    val code:	String,

     val errorMessage:	String

)