package com.example.helloworld.features.mail.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.helloworld.databinding.FragmentMailListBinding
import com.example.helloworld.features.mail.data.Mail

class MailListFragment: Fragment() {

    private lateinit var binding: FragmentMailListBinding
    private val listener by lazy { activity as MailListFragmentListener }

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
            listener.onMailSelected(Mail("Test", "Test", "Test", "Test"))
        }
    }
}

interface MailListFragmentListener {
    fun onMailSelected(mail: Mail)
}
