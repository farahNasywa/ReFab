package com.example.refab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        findViewById<TextView>(R.id.textBeranda).setOnClickListener {
            startActivity(Intent(this, BerandaActivity::class.java))
        }

        findViewById<TextView>(R.id.textNotifikasi).setOnClickListener {
            startActivity(Intent(this, NotifikasiActivity::class.java))
        }

        findViewById<TextView>(R.id.textPengaturan).setOnClickListener {
            startActivity(Intent(this, PengaturanActivity::class.java))
        }

        findViewById<TextView>(R.id.textProduk).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        findViewById<TextView>(R.id.textKebijakan).setOnClickListener {
            startActivity(Intent(this, KebijakanActivity::class.java))
        }

        findViewById<TextView>(R.id.textSyarat).setOnClickListener {
            startActivity(Intent(this, SyaratDanKetentuanActivity::class.java))
        }

        findViewById<TextView>(R.id.textFAQ).setOnClickListener {
            startActivity(Intent(this, FAQActivity::class.java))
        }

        findViewById<Button>(R.id.btnlogout).setOnClickListener {
            finishAffinity() // Keluar dari semua activity
        }
    }
}
