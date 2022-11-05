package com.d3ti.software_engineer_asignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NurulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Rafael"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nurul)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}