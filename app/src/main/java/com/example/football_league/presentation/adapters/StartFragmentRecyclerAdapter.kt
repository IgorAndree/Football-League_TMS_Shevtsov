package com.example.football_league.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.football_league.R
import com.example.football_league.domain.models.DomainLeagues

internal class StartFragmentRecyclerAdapter(
    private var context: Context,
    private val items: List<DomainLeagues>,
    private val onItemClickEvent: (View) -> Unit
) : RecyclerView.Adapter<StartFragmentRecyclerAdapter.StartViewHolder>() {
    class StartViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val imageImageView: ImageView = itemView.findViewById(R.id.logo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_start_fragment_layout, parent, false)
        itemView.setOnClickListener {
            onItemClickEvent(it)
        }
        return StartViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.apply {
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

