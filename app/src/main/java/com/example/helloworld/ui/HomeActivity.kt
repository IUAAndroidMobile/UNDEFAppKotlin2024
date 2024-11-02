package com.example.helloworld.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityHomeBinding
import com.example.helloworld.domain.ColorRepository
import com.example.helloworld.features.mail.ui.MailActivity
import com.example.helloworld.ui.colorRecyclerView.Color
import com.example.helloworld.ui.colorRecyclerView.ColorItemClickListener
import com.example.helloworld.ui.colorRecyclerView.ColorListAdapter
import com.example.helloworld.ui.viewmodels.HomeViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity(), ColorItemClickListener {

    private lateinit var binding: ActivityHomeBinding

    private val data = mutableListOf<Color>()

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        initBottomBar()
        GlobalScope.launch {
            viewModel = HomeViewModel(ColorRepository())
            viewModel.insertColor(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        }
    }

    private fun initBottomBar() {
        binding.homeBottomBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mailActivity -> {
                    val intent = Intent(this, MailActivity::class.java)
                    startActivity(intent)
                    true
                }

                else  -> false
            }


        }
    }

    private fun initRecyclerView() {
        initColor()
        val recyclerView = binding.colorRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ColorListAdapter(data, this)
    }

    private fun initColor() {



        data.add(Color(title = "Colores primarios", type = 2))
        data.add(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex), type = 1))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex), type = 1))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex), type = 1))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex), type = 1))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex), type = 1))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex), type = 1))

        data.add(Color(title = "Colores secundarios", type = 2))
        data.add(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex), type = 1))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex), type = 1))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex), type = 1))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex), type = 1))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex), type = 1))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex), type = 1))

        data.add(Color(title = "Mas colores", type = 2))
        data.add(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex), type = 1))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex), type = 1))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex), type = 1))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex), type = 1))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex), type = 1))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex), type = 1))
        data.add(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex), type = 1))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex), type = 1))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex), type = 1))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex), type = 1))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex), type = 1))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex), type = 1))
        data.add(Color(getString(R.string.red), getString(R.string.redHex), type = 1))
        data.add(Color(getString(R.string.green), getString(R.string.greenHex), type = 1))
        data.add(Color(getString(R.string.blue), getString(R.string.blueHex), type = 1))
        data.add(Color(getString(R.string.yellow), getString(R.string.yellowHex), type = 1))
        data.add(Color(getString(R.string.orange), getString(R.string.orangeHex), type = 1))
        data.add(Color(getString(R.string.brown), getString(R.string.brownHex), type = 1))
        data.add(Color(getString(R.string.grey), getString(R.string.greyHex), type = 1))

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Color seleccionado: ${data.get(position).name}", Toast.LENGTH_SHORT)
            .show()
    }

    override fun onButtonClickListener(color: Color) {
        Toast.makeText(this, "Hexadecimal seleccionado: ${color.hex}", Toast.LENGTH_SHORT).show()
    }

}