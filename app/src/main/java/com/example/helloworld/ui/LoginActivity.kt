package com.example.helloworld.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityLoginBinding
import com.example.helloworld.model.User
import com.example.helloworld.utils.EMAIL_PARAM
import com.example.helloworld.utils.PASSWORD_PARAM
import com.example.helloworld.utils.USER_PARAM

class LoginActivity : Activity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.faqsButton.setOnClickListener {
            Toast.makeText(this, getString(R.string.faqs_button_error_text), Toast.LENGTH_SHORT).show()
        }

        binding.loginButton.setOnClickListener {
            val loginIntent = Intent(this, HomeActivity::class.java)
            startActivity(loginIntent)

        }

        binding.registerButton.setOnClickListener {
            val user = User(
                name = "",
                email = binding.emailInput.text.toString(),
                password = binding.passwordInput.text.toString()
            )
            val registerIntent = Intent(this, RegisterActivity::class.java)

            registerIntent.putExtra(USER_PARAM, user)

            startActivity(registerIntent)
        }

    }

}