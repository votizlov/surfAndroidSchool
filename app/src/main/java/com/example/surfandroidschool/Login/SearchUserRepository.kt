package com.example.surfandroidschool.Login

import com.example.surfandroidschool.NetworkService

class SearchUserRepository(val userAPI: UserAPI) {
        fun searchUser(location: String, language: String) {
            val userAPI = NetworkService.createUserAPI()

        }

}