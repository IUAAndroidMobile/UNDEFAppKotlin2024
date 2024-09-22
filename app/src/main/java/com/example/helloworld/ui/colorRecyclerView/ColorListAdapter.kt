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
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val COLOR_ITEM = 1
    val COLOR_TITLE = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == COLOR_ITEM) {
            val row =
                LayoutInflater.from(parent.context).inflate(R.layout.color_item, parent, false)
            return ColorViewHolder(row, itemClickListener, data)
        } else {
            val row =
                LayoutInflater.from(parent.context).inflate(R.layout.title_color_item, parent, false)
            return ColorTitleViewHolder(row)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val color = data[position]
        if (holder is ColorViewHolder) {
            holder.colorTitle.setText(color.name)
            holder.colorSubtitle.setText(color.hex)

            val gradient = android.graphics.Color.parseColor(color.hex)
            holder.circleView.setBackgroundColor(gradient)
        } else if (holder is ColorTitleViewHolder) {
            holder.colorTitle.setText(color.title)
        }
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int  = data[position].type
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

class ColorTitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var colorTitle: TextView = itemView.findViewById(R.id.titleColor)
}

interface ColorItemClickListener {
    fun onItemClick(position: Int)

    fun onButtonClickListener(color: Color)
}
