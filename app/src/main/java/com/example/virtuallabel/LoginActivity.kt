package com.example.virtuallabel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btCadastrar = findViewById<Button>(R.id.btCadastrar)

        btCadastrar.setOnClickListener {
            TelaCadastrarDica()
        }

    }

    private fun TelaCadastrarDica(){
        val i = Intent(this,CadastrarDica::class.java)
        startActivity(i)
    }
}