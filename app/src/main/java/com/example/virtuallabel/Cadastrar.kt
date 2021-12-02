package com.example.virtuallabel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Cadastrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val back_cadastroDica = findViewById<ImageButton>(R.id.bt_back_cadastro)
        val irEntrar = findViewById<TextView>(R.id.entrar_again)
        val nextCadastro2 = findViewById<ImageButton>(R.id.next_cadastro2)

        back_cadastroDica.setOnClickListener {
            TelaCadastroDica()
        }

        irEntrar.setOnClickListener {
            TelaEntar()
        }

        nextCadastro2.setOnClickListener {
            TelaCadastro2()
        }
    }

    private fun TelaCadastroDica(){
        val i = Intent(this,CadastrarDica::class.java)
        startActivity(i)
    }

    private fun TelaEntar(){
        val i = Intent(this,Entrar::class.java)
        startActivity(i)
    }

    private fun TelaCadastro2(){
        val i = Intent(this,Cadastro2::class.java)
        startActivity(i)
    }
}