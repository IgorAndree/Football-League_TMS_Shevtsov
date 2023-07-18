package com.example.football_league.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football_league.R
import com.example.football_league.R.layout.item_leagues_layout
import com.example.football_league.domain.models.DomainLeagues

class LeaguesRecyclerAdapter(
    private var context: Context,
    private val items: List<DomainLeagues>,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<LeaguesRecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val imageImageView: ImageView = itemView.findViewById(R.id.logo)
        val titleTextView: TextView = itemView.findViewById(R.id.name)
        val descriptionTextView: TextView = itemView.findViewById(R.id.country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(item_leagues_layout, parent, false)
        itemView.setOnClickListener {
            onItemClickEvent(it)
        }
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            titleTextView.text = items[position].name
            descriptionTextView.text = items[position].country
            Glide
                .with(context)
                .load(items[position].logo)
                .into(imageImageView)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}