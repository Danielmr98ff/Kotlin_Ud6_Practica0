package com.example.kotlin_ud6_practica0


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonaAdapter(private val listaPersonas: List<Persona>) :
    RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPersona: ImageView = itemView.findViewById(R.id.imgPersona)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvDescripcion: TextView = itemView.findViewById(R.id.tvDescripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = listaPersonas[position]
        holder.tvNombre.text = persona.nombre
        holder.tvDescripcion.text = persona.descripcion
        holder.imgPersona.setImageResource(persona.imagenResId)
    }

    override fun getItemCount(): Int = listaPersonas.size
}