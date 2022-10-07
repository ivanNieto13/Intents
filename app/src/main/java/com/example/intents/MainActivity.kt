package com.example.intents

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        /*Toast.makeText(this, "Click on button", Toast.LENGTH_SHORT).show()
        val uri = Uri.parse("https://www.tic.unam.mx")
        startActivity(Intent(Intent.ACTION_VIEW, uri))*/

        /*val uri = Uri.parse("tel:5512345678")
        startActivity(Intent(Intent.ACTION_DIAL, uri))*/

        /*val uri = Uri.parse("geo:0,0?q=Puerto+Ciudad+Madero+23")
        startActivity(Intent(Intent.ACTION_VIEW, uri))*/

        /*val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto:5512345678")
            putExtra("sms_body", "Hola, ¿sigue disponible el producto?")
        }

        if (intent.resolveActivity(packageManager)!= null) {
            startActivity(intent)
        }*/

        val intent = Intent(Intent.ACTION_SENDTO).apply {
            putExtra(Intent.EXTRA_EMAIL, arrayOf("amaury@comunidad.unam.mx","moviles.diplomado@gmail.com"))
            putExtra(Intent.EXTRA_SUBJECT, "Prueba diplo")
            putExtra(Intent.EXTRA_TEXT, "Esto es una prueba para participación del diplomado de móviles")
            type = "message/rfc822"
        }
        startActivity(intent)
    }
}