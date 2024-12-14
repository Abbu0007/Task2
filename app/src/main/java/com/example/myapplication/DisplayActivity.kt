package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        val tvWelcome: TextView = findViewById(R.id.tvWelcome)
        val tvEmail: TextView = findViewById(R.id.tvEmail)
        val tvGender: TextView = findViewById(R.id.tvGender)
        val tvCountry: TextView = findViewById(R.id.tvCountry)
        val tvCity: TextView = findViewById(R.id.tvCity)
        val lvLanguages: ListView = findViewById(R.id.lvLanguages)


        val name = intent.getStringExtra("NAME")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")
        val country = intent.getStringExtra("COUNTRY")
        val city = intent.getStringExtra("CITY")
        val languages = intent.getStringArrayListExtra("LANGUAGES")


        tvWelcome.text = "Welcome Back, $name"
        tvEmail.text = "Email : $email"
        tvGender.text = "Gender : $gender"
        tvCountry.text = "Country : $country"
        tvCity.text = "City : $city"


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages ?: listOf())
        lvLanguages.adapter = adapter
    }
}
