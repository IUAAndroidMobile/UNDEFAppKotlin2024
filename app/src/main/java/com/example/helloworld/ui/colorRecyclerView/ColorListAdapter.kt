package com.example.helloworld.ui.colorRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.R

class ColorListAdapter(
    private val data: List<Color>,
    private val itemClickListener: ColorItemClickListener
) : RecyclerView.Adapter<ColorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.color_item, parent, false)
        return ColorViewHolder(row, itemClickListener, data)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val color = data.get(position)

        holder.colorTitle.setText(color.name)
        holder.colorSubtitle.setText(color.hex)

        val gradient = android.graphics.Color.parseColor(color.hex)
        holder.circleView.setBackgroundColor(gradient)
    }

    override fun getItemCount(): Int = data.size

}

class ColorViewHolder(itemView: View, private val itemClickListener: ColorItemClickListener, private val data: List<Color>,) : RecyclerView.ViewHolder(itemView) {

    var circleView: View = itemView.findViewById(R.id.circle_view)
    var colorTitle: TextView = itemView.findViewById(R.id.title_text_view)
    var colorSubtitle: TextView = itemView.findViewById(R.id.subtitle_text_view)
    var button: View = itemView.findViewById(R.id.item_color_button)

    init {
        itemView.setOnClickListener {
            itemClickListener.onItemClick(adapterPosition)
        }
        button.setOnClickListener {
            itemClickListener.onButtonClickListener(data[adapterPosition])
        }

    }
}

interface ColorItemClickListener {
    fun onItemClick(position: Int)

    fun onButtonClickListener(color: Color)
}
