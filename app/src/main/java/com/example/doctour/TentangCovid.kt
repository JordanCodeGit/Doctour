package com.example.doctour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TentangCovid  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tentang_covid)

        supportActionBar?.hide()

    }
}