package com.example.zadanie0311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
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

        // DODAWANIE DO STOSU
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
        // USUWANIE ZE STOSU
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

        // OSTATNI ELEMENT STOSU
        findViewById<Button>(R.id.LastElement).setOnClickListener {
            if (!stos.isEmpty()){
                liczba = stos.last()
                FirstEl.text = liczba.toString()

            }
            else{
                FirstEl.text = "stos jest pusty!"
            }
        }


        val kolejka: Queue<Int> = LinkedList<Int>()
        var liczba1 = 1
        var elementy = 0

        val KolejkaCOunt = findViewById<TextView>(R.id.kolejkaCount)

        // DODAWANIE DO KOLEJKI
        findViewById<Button>(R.id.dodajKBtn).setOnClickListener {
            kolejka.add(liczba1)
            liczba1 += 1
            elementy +=1
            KolejkaCOunt.text = "Kolejka \n " + elementy.toString()
        }

        // USUWANIE Z KOLEJKI
        findViewById<Button>(R.id.usunKBtn).setOnClickListener {
            if (!kolejka.isEmpty()){
                kolejka.remove()
                elementy -= 1
                KolejkaCOunt.text = "Kolejka \n " + elementy.toString()
            }
            else{
                KolejkaCOunt.text = "Kolejka \n KOLEJKA JEST PUSTA"
            }
        }

        //PIERWSZY ELEMENT KOLEJKI
        findViewById<Button>(R.id.FirstKol).setOnClickListener {
            if (!kolejka.isEmpty()){
                val first = kolejka.element()
                findViewById<TextView>(R.id.firstEl).text = first.toString()
            }
            else{
                findViewById<TextView>(R.id.firstEl).text = "KOLEJKA JEST PUSTA"
            }
        }

        // OSTATNI ELEMENT KOLEJKI
        findViewById<Button>(R.id.ostElement).setOnClickListener {
            if (!kolejka.isEmpty()){
                val last = kolejka.last()
                findViewById<TextView>(R.id.LasttEl2).text = last.toString()
            }
            else{
                findViewById<TextView>(R.id.LasttEl2).text = "KOLEJKA JEST PUSTA"
            }
        }


    }


}