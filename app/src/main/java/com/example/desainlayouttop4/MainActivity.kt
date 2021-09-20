package com.example.desainlayouttop4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    open val Button: com.google.android.material.button.MaterialButton by lazy {findViewById(R.id.secondActivity)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button.setOnClickListener {
            val intent=Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}