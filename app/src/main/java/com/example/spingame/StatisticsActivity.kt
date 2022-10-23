package com.example.spingame

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class StatisticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        val actionBar = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled(true)


    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}