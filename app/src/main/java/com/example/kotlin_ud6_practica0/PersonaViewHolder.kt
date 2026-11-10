package com.example.kotlin_ud6_practica0

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.kotlin_ud6_practica0.databinding.ItemPersonaBinding

class PersonaViewHolder(private val binding: ItemPersonaBinding) : RecyclerView.ViewHolder(binding.root) {
    fun render(persona: Persona, onClickListener: (Persona) -> Unit) {
        binding.tvNombre.text = persona.nombre
        binding.tvDescripcion.text = persona.descripcion

        Glide.with(binding.imgPersona.context)
            .load(persona.imagenResId)
            .fitCenter()
            .placeholder(R.drawable.ic_persona_placeholder)
            .error(R.drawable.ic_persona_error)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.imgPersona)
        binding.root.setOnClickListener {
            onClickListener(persona)
        }
    }
}



