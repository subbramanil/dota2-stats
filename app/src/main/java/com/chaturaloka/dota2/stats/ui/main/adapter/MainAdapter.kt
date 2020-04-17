package com.chaturaloka.dota2.stats.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chaturaloka.dota2.stats.R
import com.chaturaloka.dota2.stats.data.model.Hero
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(
    private val heroes: ArrayList<Hero>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(hero: Hero) {
            itemView.tvHeroName.text = hero.localized_name
            itemView.tvAttackType.text = hero.attack_type
            /*Glide.with(itemView.imageViewAvatar.context)
                .load(hero.avatar)
                .into(itemView.imageViewAvatar)*/
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(heroes[position])

    fun addData(list: List<Hero>) {
        heroes.addAll(list)
    }

}