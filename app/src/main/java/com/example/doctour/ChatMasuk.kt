package com.example.doctour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChatMasuk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pesan)

        supportActionBar?.hide()
    }

}
