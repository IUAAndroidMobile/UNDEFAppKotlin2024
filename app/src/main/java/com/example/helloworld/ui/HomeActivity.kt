package com.example.helloworld.ui

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityHomeBinding
import com.example.helloworld.ui.colorRecyclerView.Color
import com.example.helloworld.ui.colorRecyclerView.ColorListAdapter

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private val data = mutableListOf<Color>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initColor()

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.colorRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ColorListAdapter(data)
    }

    private fun initColor() {

        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.blue), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.amber), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.blue), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.amber), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.blue), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.amber), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.blue), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.amber), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.yellow), resources.getColor(R.color.yellow).toString()))
        data.add(Color(getString(R.string.indigo), resources.getColor(R.color.indigo).toString()))
        data.add(Color(getString(R.string.green), resources.getColor(R.color.green).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
        data.add(Color(getString(R.string.red), resources.getColor(R.color.red).toString()))
    }

}