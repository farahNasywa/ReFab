package com.example.refab // Ganti sesuai dengan nama package kamu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PesanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pesan) // Ganti sesuai nama XML kamu

        // Tombol Menu
        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        btnMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        // Tombol Back
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, StoreProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Tombol "Gunakan alamatmu di sini"
        val btnUseAddress = findViewById<Button>(R.id.btnUseAddress)
        btnUseAddress.setOnClickListener {
            val intent = Intent(this, DeliveryActivity::class.java)
            startActivity(intent)
        }
    }
}
