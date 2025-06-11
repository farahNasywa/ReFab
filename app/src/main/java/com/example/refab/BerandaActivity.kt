package com.example.refab // Ganti sesuai nama package kamu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BerandaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda) // Ganti jika nama file XML kamu berbeda

        // Tombol Jelajahi Koleksi
        val exploreButton: Button = findViewById(R.id.exploreButton)
        exploreButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        // Tombol Menu di Toolbar
        val menuButton: ImageButton = findViewById(R.id.menuButton)
        menuButton.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        // Gambar batik_new di produk terbaru
        val batikImage: ImageView = findViewById(R.id.batikNewImage)
        batikImage.setOnClickListener {
            val intent = Intent(this, StoreProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
