package com.example.refab // Ganti sesuai package kamu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile) // Pastikan layout kamu bernama ini

        // Tombol Menu
        findViewById<ImageButton>(R.id.btnMenu).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        // Tombol Pengaturan
        findViewById<Button>(R.id.btnSettings).setOnClickListener {
            startActivity(Intent(this, PengaturanActivity::class.java))
        }

        // Tombol FAQ
        findViewById<Button>(R.id.btnFAQ).setOnClickListener {
            startActivity(Intent(this, FAQActivity::class.java))
        }

        // Tombol Kebijakan Privasi
        findViewById<Button>(R.id.btnPrivacy).setOnClickListener {
            startActivity(Intent(this, KebijakanActivity::class.java)) // gunakan KebijakanActivity jika kamu belum punya PrivacyActivity terpisah
        }

        // Tombol Syarat dan Ketentuan
        findViewById<Button>(R.id.btnTerms).setOnClickListener {
            startActivity(Intent(this, SyaratDanKetentuanActivity::class.java))
        }

        // Tombol Edit Profile
        findViewById<Button>(R.id.btnEditProfile).setOnClickListener {
            startActivity(Intent(this, ProfileSettingActivity::class.java))
        }

        // Tombol Keluar
        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            finishAffinity() // Menutup seluruh aplikasi
        }
    }
}
