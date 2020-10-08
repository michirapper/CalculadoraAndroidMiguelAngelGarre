package com.example.calculadoramiguelangel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun SalirApp(view: View) {
        System.exit(0);
    }

    fun Acceder(view: View) {
        var editTextUser = findViewById<EditText>(R.id.editTextUser)
        var user: String = editTextUser.text.toString()
        var miIntent = Intent(this, MainActivity2::class.java)
        miIntent.putExtra("user", user)
        startActivity(miIntent)
        finish()
    }

}