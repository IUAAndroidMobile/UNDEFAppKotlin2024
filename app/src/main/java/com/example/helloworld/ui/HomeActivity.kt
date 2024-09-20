package com.example.helloworld.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityHomeBinding
import com.example.helloworld.ui.colorRecyclerView.Color
import com.example.helloworld.ui.colorRecyclerView.ColorItemClickListener
import com.example.helloworld.ui.colorRecyclerView.ColorListAdapter

class HomeActivity : AppCompatActivity(), ColorItemClickListener {

    private lateinit var binding: ActivityHomeBinding

    private val data = mutableListOf<Color>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initColor()


        val recyclerView = binding.colorRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ColorListAdapter(data, this)
    }

    private fun initColor() {

        data.add(Color(getString(R.string.red), getString(R.string.redHex)))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex)))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex)))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex)))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex)))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex)))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex)))

        data.add(Color(getString(R.string.red), getString(R.string.redHex)))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex)))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex)))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex)))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex)))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex)))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex)))

        data.add(Color(getString(R.string.red), getString(R.string.redHex)))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex)))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex)))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex)))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex)))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex)))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex)))
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Color seleccionado: ${data.get(position).name}", Toast.LENGTH_SHORT).show()
    }

    override fun onButtonClickListener(color: Color) {
        Toast.makeText(this, "Hexadecimal seleccionado: ${color.hex}", Toast.LENGTH_SHORT).show()
    }

}