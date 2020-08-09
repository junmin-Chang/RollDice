package com.chjm.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        rollButton.setOnClickListener {
            val diceNumber = Random.nextInt(1, 7)


            when (diceNumber) {
                1 -> {
                    diceImage.setImageResource(R.drawable.dice1)
                }
                2 -> {
                    diceImage.setImageResource(R.drawable.dice2)
                }
                3 -> {
                    diceImage.setImageResource(R.drawable.dice3)
                }
                4 -> {
                    diceImage.setImageResource(R.drawable.dice4)
                }
                5 -> {
                    diceImage.setImageResource(R.drawable.dice5)
                }
                6 -> {
                    diceImage.setImageResource(R.drawable.dice6)
                }
            }
        }


    }


}
