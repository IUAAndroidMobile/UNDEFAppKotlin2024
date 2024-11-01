package com.example.helloworld.features.mail.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityMailBinding
import com.example.helloworld.features.mail.data.Mail

class MailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /**private fun navigateToMailListFragment() {
        val mailListFragment = MailListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, mailListFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onMailSelected(mail: Mail) {
        supportFragmentManager.beginTransaction().replace(
            R.id.fragmentContainer,
            DetailMailFragment()
        ).addToBackStack(null).commit()
    }**/
}
