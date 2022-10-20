package com.example.spingame

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val switchToGameActivity = findViewById(R.id.activity_first_button);
         switchToGameActivity.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view){
                 switchActivities();
             }
         });
    }
    private fun switchActivities() {
        val switchActivityIntent = Intent(this, GameActivity::class.java)
        startActivity(switchActivityIntent)
    }
}