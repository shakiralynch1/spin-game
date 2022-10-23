package com.example.spingame


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton: Button = findViewById(R.id.button)
        val instructionsButton: Button = findViewById(R.id.button2)
        val statisticsButton: Button = findViewById(R.id.button3)

        playButton.setOnClickListener {
            playGame()
        }

        instructionsButton.setOnClickListener {
            val intent = Intent(this, InstructionsActivity::class.java)
            startActivity(intent)
        }

        statisticsButton.setOnClickListener {
            val intent = Intent(this, StatisticsActivity::class.java)
            startActivity(intent)

        }



    }

    private fun draw(num: Int): Int {

        val drawableResource = when (num) {
            1 -> R.drawable.rainbow
            2 -> R.drawable.voodoo
            3 -> R.drawable.dragon
            4 -> R.drawable.heart_1_
            else -> R.drawable.rainbow
        }
        return drawableResource
    }

    private fun playGame() {

        val char = Play(4)
        val charRoll = char.play()


        val char1: ImageView = findViewById(R.id.imageView3)
        val char2: ImageView = findViewById(R.id.imageView4)
        val char3: ImageView = findViewById(R.id.imageView5)

        val drawableResource = draw(char.play())
        val drawableResource2 = draw(char.play())
        val drawableResource3 = draw(char.play())

        char1.setImageResource(drawableResource)
        char2.setImageResource(drawableResource2)
        char3.setImageResource(drawableResource3)



    }

    class Play(private val numValues: Int) {
        fun play(): Int {
            val random = (1..numValues).random()
            Log.d("Random: ", random.toString())
            return random
        }
    }

}



