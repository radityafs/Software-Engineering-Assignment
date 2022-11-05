package com.d3ti.software_engineer_asignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DewantoroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Dewantoro"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dewantoro)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}