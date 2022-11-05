package com.d3ti.software_engineer_asignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SherlyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Sherly"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sherly)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}