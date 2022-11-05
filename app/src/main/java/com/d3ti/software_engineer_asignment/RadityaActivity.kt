package com.d3ti.software_engineer_asignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RadityaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Raditya"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raditya)
    }
}