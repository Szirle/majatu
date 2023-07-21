package com.example.majatu

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaFiszek = arrayOf(
            Fiszka("cześć", "ciao"),
            Fiszka("nmzc", "prg"),
            Fiszka("chuj", "cazzo"),
            Fiszka(
                "nie chcę rozjaśnić włosów",
                "eeee non eee voglio yyy fare i miei capelli hmmm chiari"
            ),
            Fiszka("samolot", "l'aereo"),
        )

        val poleTekstowePolskiegoSlowa: TextView = findViewById(R.id.polskieSlowo)
        val poleTekstoweWloskiegoTlumaczenia: TextView = findViewById(R.id.wloskieTlumaczenie)
        val baton: Button = findViewById(R.id.baton)

        var numerPokazywanejFiszki = 0
        var pokazanaFiszka: Fiszka = listaFiszek[numerPokazywanejFiszki]

        poleTekstowePolskiegoSlowa.text = pokazanaFiszka.polskieSlowo
        poleTekstoweWloskiegoTlumaczenia.text = pokazanaFiszka.wloskieTlumaczenie

        baton.setOnClickListener {
            if (baton.text == "next") {
                numerPokazywanejFiszki += 1
                if (listaFiszek.size == numerPokazywanejFiszki) {
                    numerPokazywanejFiszki = 0
                }
                pokazanaFiszka = listaFiszek[numerPokazywanejFiszki]
                poleTekstowePolskiegoSlowa.text = pokazanaFiszka.polskieSlowo
                poleTekstoweWloskiegoTlumaczenia.text = pokazanaFiszka.wloskieTlumaczenie
                poleTekstoweWloskiegoTlumaczenia.visibility = View.INVISIBLE
                baton.text = "poka odpowiedź"
            } else {
                poleTekstoweWloskiegoTlumaczenia.visibility = View.VISIBLE
                baton.text = "next"
            }
        }

    }
}