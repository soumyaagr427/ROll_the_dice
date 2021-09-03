package com.example.roll_the_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {  }
    }



    class Dice{
        var side=6

        fun rolling()
        {
            val diceRange = 1..6
            val randomNumber = diceRange.random()
            println("Random number: ${randomNumber}")
        }
    }

    val Dice1=Dice()
    println(Dice1.side)



}
