package com.example.refab // Ganti sesuai dengan package kamu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SyaratDanKetentuanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.syaratdanketentuan) // Ganti jika layout kamu beda

        // Tombol Menu
        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        btnMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
