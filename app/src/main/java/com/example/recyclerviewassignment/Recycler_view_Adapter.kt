package com.example.recyclerviewassignment

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class Recycler_view_Adapter:RecyclerView.Adapter<Recycler_view_Adapter.ViewHolder>(){

    private var names = arrayOf("Tonyo Godson", "Ola Makavelli", "Samuel Garfield", "Kome Holmes", "Omolade Rogers")
    private var bdays = arrayOf("01.04.2022", "20.10.2020", "20.10.2020", "20.10.2020", "20.10.2020")
    private var hmdays = arrayOf("29 days left", "30 days left", "30 days left", "30 days left")
    private  var images = arrayOf(R.drawable.tonyo, R.drawable.olapng, R.drawable.garfield, R.drawable.kome, R.drawable.lade)
    private var straws = arrayOf(R.drawable.ic_straw5, R.drawable.ic_straw4, R.drawable.ic_straw3, R.drawable.ic_straw2, R.drawable.ic_straw)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recycler_view_Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contacts, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Recycler_view_Adapter.ViewHolder, position: Int) {
        holder.celebrantImage.setImageResource(images[position])
        holder.celebrantName.text = names[position]
        holder.celebrantBday.text = bdays[position]
        holder.daysRemaining.text = hmdays[position]
        holder.strawColor.setImageResource(straws[position])
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var celebrantImage: ImageView
        var celebrantName: TextView
        var celebrantBday: TextView
        var daysRemaining: TextView
        var strawColor : ImageView

        init{
            celebrantImage = itemView.findViewById(R.id.ola_iv)
            celebrantName = itemView.findViewById(R.id.ola_macavelli_tv)
            celebrantBday = itemView.findViewById(R.id.calendar_tv)
            daysRemaining = itemView.findViewById(R.id.daysleft_tv)
            strawColor = itemView.findViewById(R.id.straw_iv)
        }

    }
}

