package com.example.refab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup) // Pastikan file signup.xml ada
        supportActionBar?.hide()

        // Aksi tombol daftar → kembali ke LoginActivity
        val daftarButton = findViewById<Button>(R.id.signupButton)
        daftarButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // opsional agar tidak bisa kembali ke SignUp
        }
    }
}
