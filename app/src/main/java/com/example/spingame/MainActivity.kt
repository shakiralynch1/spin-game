package com.example.spingame

import GameActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<View>(R.id.button) as Button
        button!!.setOnClickListener { openNewActivity() }
    }

    fun openNewActivity() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}