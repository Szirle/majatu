package com.example.majatu.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.majatu.R
import com.example.majatu.classes.FiszkaLevel2
import kotlin.random.Random

class Level2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_2)

        val listaFiszek = listOf<FiszkaLevel2>(
            FiszkaLevel2(polskieSlowo = "Auto", gitTlumaczenie = "La Macchina", listOf("Wrooooom", "Machinacina", "L'aereoaf")),
            FiszkaLevel2(
                polskieSlowo = "Dziena",
                gitTlumaczenie = "Grazie",
                listOf("Dziaaa", "Per faworek", "Ciao")
            ),
            FiszkaLevel2(
                polskieSlowo = "Przepraszam",
                gitTlumaczenie = "Spiacente",
                listOf("Grazie mille", "Oi!", "Scuse moi :(")
            ),
            FiszkaLevel2(
                polskieSlowo = "Niunia",
                gitTlumaczenie = "La ragazza",
                listOf("El Nino", "La Hanamontana", "Il Uomo")
            )
        )
        val przyciskOdp1 : Button = findViewById(R.id.button)
        val przyciskOdp2 : Button = findViewById(R.id.button2)
        val przyciskOdp3 : Button = findViewById(R.id.button3)
        val przyciskOdp4 : Button = findViewById(R.id.button4)
        val polskieSlowo : TextView = findViewById(R.id.polskieSlowoTextView)

        val wyswietlanaFiszka = listaFiszek[0]
        polskieSlowo.text = wyswietlanaFiszka.polskieSlowo
        val randomInt: Int = Random.nextInt(1, 5)





    }

    fun wyswietlFiszki(numerBatona: Int, wyswietlanaFiszka: FiszkaLevel2){
        if (numerBatona == 1) {
            przyciskOdp1.text = wyswietlanaFiszka.gitTlumaczenie
            przyciskOdp2.text = wyswietlanaFiszka.zleTlumaczenia[0]
            przyciskOdp3.text = wyswietlanaFiszka.zleTlumaczenia[1]
            przyciskOdp4.text = wyswietlanaFiszka.zleTlumaczenia[2]
        }
        if (numerBatona == 2) {
            przyciskOdp2.text = wyswietlanaFiszka.gitTlumaczenie
            przyciskOdp1.text = wyswietlanaFiszka.zleTlumaczenia[0]
            przyciskOdp3.text = wyswietlanaFiszka.zleTlumaczenia[1]
            przyciskOdp4.text = wyswietlanaFiszka.zleTlumaczenia[2]
        }
        if (numerBatona == 3) {
            przyciskOdp3.text = wyswietlanaFiszka.gitTlumaczenie
            przyciskOdp1.text = wyswietlanaFiszka.zleTlumaczenia[0]
            przyciskOdp2.text = wyswietlanaFiszka.zleTlumaczenia[1]
            przyciskOdp4.text = wyswietlanaFiszka.zleTlumaczenia[2]
        }
        if (numerBatona == 4) {
            przyciskOdp4.text = wyswietlanaFiszka.gitTlumaczenie
            przyciskOdp1.text = wyswietlanaFiszka.zleTlumaczenia[0]
            przyciskOdp2.text = wyswietlanaFiszka.zleTlumaczenia[1]
            przyciskOdp3.text = wyswietlanaFiszka.zleTlumaczenia[2]
        }
    }
}