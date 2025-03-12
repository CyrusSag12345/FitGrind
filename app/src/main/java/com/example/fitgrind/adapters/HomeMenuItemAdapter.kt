package com.example.fitgrind.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitgrind.R
import com.example.fitgrind.models.HomeMenuItem

class HomeMenuItemAdapter(
    private val itemList: List<HomeMenuItem>,
    private val onButtonClick: (HomeMenuItem) -> Unit
) : RecyclerView.Adapter<HomeMenuItemAdapter.HomeMenuViewHolder>() {

    class HomeMenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.txtTitle)
        val actionButton: Button = itemView.findViewById(R.id.btnAction)
        val imageView: ImageView = itemView.findViewById(R.id.imgBackground)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_menu, parent, false)
        return HomeMenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeMenuViewHolder, position: Int) {
        val item = itemList[position]
        holder.titleTextView.text = item.title
        holder.actionButton.text = item.subtitle
        holder.imageView.setImageResource(item.imageRes)

        holder.actionButton.setOnClickListener {
            onButtonClick(item)
        }
    }

    override fun getItemCount(): Int = itemList.size
}