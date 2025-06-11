package com.example.refab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        // Menghilangkan ActionBar
        supportActionBar?.hide()

        // Navigasi ke SignUpActivity
        val signUpText = findViewById<TextView>(R.id.signupLink)
        signUpText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Navigasi ke BerandaActivity setelah login
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
            finish() // agar user tidak bisa kembali ke login dengan tombol back
        }
    }
}
