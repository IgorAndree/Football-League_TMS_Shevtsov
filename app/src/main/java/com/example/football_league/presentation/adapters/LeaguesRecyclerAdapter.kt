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

internal class LeaguesRecyclerAdapter(
    private var context: Context,
    private val items: List<DomainLeagues>,
) : RecyclerView.Adapter<LeaguesRecyclerAdapter.LeaguesViewHolder>() {
    class LeaguesViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val imageImageView: ImageView = itemView.findViewById(R.id.logo)
        val titleTextView: TextView = itemView.findViewById(R.id.name)
        val descriptionTextView: TextView = itemView.findViewById(R.id.country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeaguesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(item_leagues_layout, parent, false)
        itemView.setOnClickListener {
        }
        return LeaguesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LeaguesViewHolder, position: Int) {
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