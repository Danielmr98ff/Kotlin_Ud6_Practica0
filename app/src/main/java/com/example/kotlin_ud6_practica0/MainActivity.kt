package com.example.kotlin_ud6_practica0

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewPersonas)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listaPersonas = PersonaProvider.cargarPersonas()

        recyclerView.adapter = PersonaAdapter(listaPersonas)
    }
}