package com.example.virtuallabel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class CadastrarDica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_dica)

        val cadastro = findViewById<ImageButton>(R.id.btEntrarCadastro)
        val back = findViewById<ImageView>(R.id.back_dicaCadastro)

        cadastro.setOnClickListener{
            TelaCadastrar()
        }

        back.setOnClickListener{
            BackLogin()
        }
    }


    private fun BackLogin(){
        val i = Intent(this,LoginActivity::class.java)
        startActivity(i)
    }
    private fun TelaCadastrar(){
        val i = Intent(this,Cadastrar::class.java)
        startActivity(i)
    }
}