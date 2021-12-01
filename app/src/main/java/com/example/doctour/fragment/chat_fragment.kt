package com.example.doctour.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.doctour.*

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pesanmasuk)

        supportActionBar?.hide()

        val intentButton: ImageView = findViewById(R.id.pesan)
        intentButton.setOnClickListener { viewDetail() }

    }

    private fun viewDetail() {
        val intent = Intent(this, ChatMasuk::class.java)
        startActivity(intent)
    }

}

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class chat_fragment : Fragment() {
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
        return inflater.inflate(R.layout.pesanmasuk, container, false)
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            chat_fragment().apply {
                Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}