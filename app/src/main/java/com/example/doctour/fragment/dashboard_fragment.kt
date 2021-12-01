package com.example.doctour.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.doctour.*


class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()

        val intentButton: ImageView = findViewById(R.id.profile)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton1 : ImageView = findViewById(R.id.alamat)
        intentButton1.setOnClickListener { viewDetail1()}
        val intentButton2: TextView = findViewById(R.id.tentangCovid)
        intentButton2.setOnClickListener { viewDetail2() }
        val intentButton3: TextView = findViewById(R.id.infoKesehatan)
        intentButton3.setOnClickListener { viewDetail3() }
        val intentButton4: ImageView = findViewById(R.id.chat_icon)
        intentButton4.setOnClickListener { viewDetail4() }

    }

    private fun viewDetail() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
    private fun viewDetail1() {
        val intent = Intent(this, Alamat::class.java)
        startActivity(intent)
    }

    private fun viewDetail2() {
        val intent = Intent(this, TentangCovid::class.java)
        startActivity(intent)
    }

    private fun viewDetail3() {
        val intent = Intent(this, InfoKesehatan::class.java)
        startActivity(intent)
    }
    private fun viewDetail4() {
        val intent = Intent(this, Chat::class.java)
        startActivity(intent)
    }
}

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class dashboard_fragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home, container, false)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            dashboard_fragment().apply {
                Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}