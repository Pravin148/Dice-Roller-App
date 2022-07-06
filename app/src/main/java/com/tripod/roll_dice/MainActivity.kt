package com.tripod.roll_dice

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun roll(view: View) {
        val rollText : TextView = findViewById(R.id.textView)
        val diceImg : ImageView = findViewById(R.id.imageView)
        val randomPoint = (1..6).random()
        val point = when(randomPoint){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(point)
        rollText.text = "You got $randomPoint Points"
    }
}