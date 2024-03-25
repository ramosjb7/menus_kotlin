package com.example.menu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener{navigateToSaludApp()}

        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludApp.setOnClickListener{navigateIMCApp()}

    }

    private fun navigateIMCApp() {
        
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, SaludarActivity2::class.java)
        startActivity(intent)
    }
}









