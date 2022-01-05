package com.geektech.rickandmorty.ui.character

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.rickandmorty.R
import com.geektech.rickandmorty.databinding.ItemCharacterBinding
import com.geektech.rickandmorty.model.CharactersModel
import com.geektech.rickandmorty.utils.Utils.Companion.loadImage

class CharterAdapter : RecyclerView.Adapter<CharterAdapter.ViewHolder>() {

    private var list: List<CharactersModel> = listOf()
    private lateinit var binding: ItemCharacterBinding

    class ViewHolder(private val itemBinding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun onBind(model: CharactersModel) {
            itemBinding.tvName.text = model.name
            itemBinding.tvEpisode.text = model.episode.toString()
            itemBinding.tvLocation.text = model.location.name
            itemBinding.tvSpecies.text = model.species
            itemBinding.tvStatus.text = model.status
            itemBinding.ivCharacter.loadImage(itemBinding.ivCharacter.context,model.url)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}