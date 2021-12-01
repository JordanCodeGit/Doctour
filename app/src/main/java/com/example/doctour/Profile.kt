package com.example.doctour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Profile  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        supportActionBar?.hide()

    }
}
