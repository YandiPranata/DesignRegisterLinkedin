package com.example.desainlayouttop4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    val actionBar = supportActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        actionBar!!.title = ""

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}