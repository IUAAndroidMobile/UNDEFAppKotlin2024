package com.example.helloworld.ui

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import com.example.helloworld.R
import com.example.helloworld.model.User
import com.example.helloworld.utils.EMAIL_PARAM
import com.example.helloworld.utils.PASSWORD_PARAM
import com.example.helloworld.utils.USER_PARAM

class RegisterActivity : Activity() {

    private var email = ""
    private var password = ""

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        user = intent.getParcelableExtra(USER_PARAM)

        initView()
    }

    private fun initView() {
        findViewById<EditText>(R.id.email_input).setText(user?.email)
        findViewById<EditText>(R.id.password_input).setText(user?.password)
    }

}
