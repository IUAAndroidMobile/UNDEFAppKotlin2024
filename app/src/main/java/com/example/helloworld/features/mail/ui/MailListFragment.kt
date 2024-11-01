package com.example.helloworld.features.mail.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.helloworld.databinding.FragmentMailListBinding

class MailListFragment: Fragment() {

    private lateinit var binding: FragmentMailListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMailListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.test.setOnClickListener {
            val directions = MailListFragmentDirections.actionMailListFragmentToMailDetailFragment()
            directions.mail = "Mi mail"
            Navigation.findNavController(view).navigate(directions)
        }
    }
}

