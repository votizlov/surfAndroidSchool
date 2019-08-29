package com.example.surfandroidschool.Login


import com.example.surfandroidschool.NetworkService

class SearchUserRepository(phone:String,pass:String) {
            val userAPI = NetworkService.createUserAPI()
    val code = userAPI.search(User(phone,pass))
        }
