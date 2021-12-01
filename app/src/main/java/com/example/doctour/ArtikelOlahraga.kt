package com.example.doctour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ArtikelOlahraga  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artikel1)

        supportActionBar?.hide()
    }
}
