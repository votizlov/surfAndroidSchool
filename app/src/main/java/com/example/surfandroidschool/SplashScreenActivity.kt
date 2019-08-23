 package com.example.surfandroidschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.surfandroidschool.Login.LoginActivity
import java.util.*
import kotlin.concurrent.schedule

 class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, LoginActivity::class.java)
        Timer("Show time", false).schedule(300){
            startActivity(intent)
        }
    }


}
