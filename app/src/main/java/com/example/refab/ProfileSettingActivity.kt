package com.example.refab // Ganti jika package kamu berbeda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilesettings) // Pastikan layout ini ada

        // Tombol Menu
        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        btnMenu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        // Tombol Update
        val btnUpdate = findViewById<Button>(R.id.updateButton)
        btnUpdate.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
