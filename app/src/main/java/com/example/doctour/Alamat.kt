package com.example.doctour

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.doctour.fragment.dashboard_fragment

class Alamat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alamat)

        supportActionBar?.hide()

        val intentButton: TextView = findViewById(R.id.kirim)
        intentButton.setOnClickListener { viewDetail() }
    }

    private fun viewDetail() {
        val intent = Intent(this, dashboard_fragment::class.java)
        startActivity(intent)
    }
}