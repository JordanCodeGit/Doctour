package com.example.doctour

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoKesehatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artikel_main)

        supportActionBar?.hide()

        val intentButton: ImageView = findViewById(R.id.artikelOlahraga)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton1 : ImageView = findViewById(R.id.artikelMakanan)
        intentButton1.setOnClickListener { viewDetail1()}
        val intentButton2: ImageView = findViewById(R.id.artikelVaksin)
        intentButton2.setOnClickListener { viewDetail2() }
    }

    private fun viewDetail() {
        val intent = Intent(this, ArtikelOlahraga::class.java)
        startActivity(intent)
    }

    private fun viewDetail1() {
        val intent = Intent(this, ArtikelMakanan::class.java)
        startActivity(intent)
    }

    private fun viewDetail2() {
        val intent = Intent(this, ArtikelVaksin::class.java)
        startActivity(intent)
    }
}