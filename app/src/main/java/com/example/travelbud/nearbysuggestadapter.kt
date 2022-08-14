package com.example.travelbud

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class nearbysuggestadapter(private val suggestlist: List<nearbysuggest>) :
    RecyclerView.Adapter<nearbysuggestadapter.suggestviewholder>() {

    class suggestviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val suggestimg: ImageView = itemView.findViewById(R.id.locationimg)
        val suggestname: TextView = itemView.findViewById(R.id.locationname)
        val suggesttime: TextView = itemView.findViewById(R.id.time)
        val siggesttype: TextView = itemView.findViewById(R.id.type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): suggestviewholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.nearbysuggestcard, parent, false)
        return suggestviewholder(view)
    }

    override fun onBindViewHolder(holder: suggestviewholder, position: Int) {
        val suggest = suggestlist[position]
        holder.suggestimg.setImageResource(suggest.suggestimg)
        holder.suggestname.text = suggest.name
        holder.suggesttime.text = suggest.time
        holder.siggesttype.text = suggest.type
    }

    override fun getItemCount(): Int {
        return suggestlist.size
    }

}