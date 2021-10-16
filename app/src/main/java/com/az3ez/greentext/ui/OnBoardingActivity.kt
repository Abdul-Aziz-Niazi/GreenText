package com.az3ez.greentext.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.az3ez.greentext.R

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        moveToHome()
    }

    private fun moveToHome() {
        startActivity(Intent(this@OnBoardingActivity, MainActivity::class.java))
    }
}