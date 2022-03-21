package com.example.virtualLabel

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

 class DataBase {

    // [START declare_database_ref]
    private lateinit var database: DatabaseReference
    // [END declare_database_ref]

    fun initializeDbRef() {
        // [START initialize_database_ref]
        //database = Firebase.database.reference
        //database = FirebaseDatabase.getInstance().getReference("Usuario")
        database = FirebaseDatabase.getInstance().getReference("Usuario")
        // [END initialize_database_ref]
    }

    // [START rtdb_write_new_user]
    fun writeNewUser(nome: String, email: String, senha: String) {
        val user = Usuario(nome, email, senha)
        database.child(email).setValue(user)

    }
    // [END rtdb_write_new_user]




}