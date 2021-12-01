package com.example.doctour

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.doctour.fragment.Dashboard
import com.example.doctour.fragment.dashboard_fragment

class LoginActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.halaman_login)

            supportActionBar?.hide()

            val intentButton: Button = findViewById(R.id.signin)
            intentButton.setOnClickListener { viewDetail2() }

        }
    private fun viewDetail2() {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }

}

