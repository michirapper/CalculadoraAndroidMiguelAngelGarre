package com.example.calculadoramiguelangel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val objetoIntent : Intent = intent
        var user = objetoIntent.getStringExtra("user")
        setTitle("Hello " + user);
    }
}
