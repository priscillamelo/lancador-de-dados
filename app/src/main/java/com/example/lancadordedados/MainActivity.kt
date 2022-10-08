package com.example.lancadordedados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_jogar)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }

    private fun rollDice() {
        val dado = Dado(6)
        val dadoLancado = dado.roll()
        val imageDado: ImageView = findViewById(R.id.img_dado)

        val imageResource = when (dadoLancado) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageDado.setImageResource(imageResource)
        imageDado.contentDescription = dadoLancado.toString()
    }
}

class Dado(private val numberSides: Int) {
    fun roll(): Int {
        return (1..numberSides).random()
    }
}