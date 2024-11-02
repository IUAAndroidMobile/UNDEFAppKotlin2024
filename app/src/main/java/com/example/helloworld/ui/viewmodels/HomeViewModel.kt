package com.example.helloworld.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.helloworld.data.database.ColorTable
import com.example.helloworld.domain.ColorRepository
import com.example.helloworld.ui.colorRecyclerView.Color

class HomeViewModel(
    val colorRepository: ColorRepository
) {

    fun insertColor(color: Color) {
        // TODO: Mapear de Color a ColorTable!
        colorRepository.insertColor(ColorTable(color.name!!, color.hex!!))
    }

}