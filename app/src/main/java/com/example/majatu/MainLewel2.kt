package com.example.majatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainLewel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_lewel_2)

        val listaFiszek = listOf<FiszkaLevel2>(
            FiszkaLevel2("Auto", "La Macchina", listOf("Wrooooom", "Machinacina", "L'aereoaf")),
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
    }
}