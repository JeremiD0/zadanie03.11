package com.example.zadanie0311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stos = LinkedList<Int>()
        var stosEl = 0
        var liczba = 0
        val stosinput = findViewById<EditText>(R.id.dodawanie_Stosu)
        val FirstEl = findViewById<TextView>(R.id.FirstEl)
        val stosCount = findViewById<TextView>(R.id.stosCount)

        // Dodawanie
        findViewById<Button>(R.id.dodajBtn).setOnClickListener {
            if (stosinput.toString() != ""){
                liczba = stosinput.text.toString().toInt()
                stosEl += 1
                stosCount.text = "Stos \n " + stosEl.toString()
            }
            else{
                stosCount.text = "Stos \n wpisz element"
            }
        }
        // Usuwanie
        findViewById<Button>(R.id.usunBtn).setOnClickListener {
            if (!stos.isEmpty()){
                val liczba = stosinput.text.toString().toInt()
                stosEl -= 1
                stosCount.text = "Stos " + stosEl.toString()
            }
            else{
                stosCount.text = "Stos \n NIE MA ELEMENTOW W STOSIE"
            }
        }

        // Ostatni Element
        findViewById<Button>(R.id.LastElement).setOnClickListener {
            if (!stos.isEmpty()){
                liczba = stos.last()
                FirstEl.text = liczba.toString()

            }
            else{
                FirstEl.text = "stos jest pusty!"
            }
        }
    }


}