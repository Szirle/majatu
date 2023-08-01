package com.example.majatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Level2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_2)

        val baton2: Button = findViewById(R.id.baton2)
        baton2.setOnClickListener {
            startMainLewel2()
        }
    }

    fun startMainLewel2() {
        val intent = Intent(this, MainLewel2::class.java)
        startActivity(intent)
    }
}