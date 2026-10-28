package com.example.appprueba

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Creamos un texto simple en la pantalla
        val texto = TextView(this)
        texto.text = "¡Hola Mundo! Esta es mi app de prueba desde el teléfono."
        texto.textSize = 24f
        
        setContentView(texto)
    }
}
