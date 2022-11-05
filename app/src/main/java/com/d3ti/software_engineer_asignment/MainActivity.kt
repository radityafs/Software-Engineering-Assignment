package com.d3ti.software_engineer_asignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickListener();
    }

    public fun clickListener() {

        val raditya = findViewById<ImageView>(R.id.card_raditya)

        raditya.setOnClickListener {
            val intent = Intent(this, RadityaActivity::class.java)
            startActivity(intent)
        }
    }

}