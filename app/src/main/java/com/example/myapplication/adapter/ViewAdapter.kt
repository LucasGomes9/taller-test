package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.model.ListItem
import com.example.myapplication.R

class ViewAdapter(
    private val context: Context,
    private val list : List<ListItem>
) : RecyclerView.Adapter<ViewAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.title.text = item.title
        holder.subtitle.text = item.subtitle
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Item ${position +1} clicked \n Item Title ${item.title}" , Toast.LENGTH_LONG).show()
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById<TextView>(R.id.title)
        val subtitle: TextView = view.findViewById<TextView>(R.id.subtitle)
    }

}