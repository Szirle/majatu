package com.example.majatu.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.majatu.R

class StartNextLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_next_level)

        val baton2: Button = findViewById(R.id.baton2)
        baton2.setOnClickListener {
            startMainLewel2()
        }
    }

    fun startMainLewel2() {
        val intent = Intent(this, Level2Activity::class.java)
        startActivity(intent)
    }
}