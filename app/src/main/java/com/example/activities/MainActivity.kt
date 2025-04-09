package com.example.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
//        val intent = Intent(this, SignInActivity::class.java)
//        startActivity(intent)
    }
}