package com.example.calculadoramiguelangel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val objetoIntent : Intent = intent
        var user = objetoIntent.getStringExtra("user")
        setTitle("Holita " + user);
    }
    fun onClick(v: View) {
        var calculo = findViewById<TextView>(R.id.textView)
        val b: Button = v as Button
        val buttonText: String = b.getText().toString()
        print(buttonText)
        val caluloAnterior = calculo.text
        calculo.text = caluloAnterior.toString() + buttonText
    }
    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        var calculo = findViewById<TextView>(R.id.textView)
        savedInstanceState.putString("MyString", calculo.text.toString())

        super.onSaveInstanceState(savedInstanceState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        var calculo = findViewById<TextView>(R.id.textView)

        super.onRestoreInstanceState(savedInstanceState)
        val myString = savedInstanceState.getString("MyString")
        calculo.text = myString
    }


}

