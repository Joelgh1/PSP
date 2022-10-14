package com.joelgh.psp_2022.ut02.ex03.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.joelgh.psp_2022.R
import com.joelgh.psp_2022.ut02.ex03.data.local.UserLocalSource
import com.joelgh.psp_2022.ut02.ex03.data.remote.UserRemoteSource
import com.joelgh.psp_2022.ut02.ex03.data.remote.UserRepository

class Ut02Ex03Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut02_ex03)
        init()
    }

    private fun init(){
        val userRepository = UserRepository(UserLocalSource(), UserRemoteSource())
        val userRemoteSource = UserRemoteSource()
        Thread{
            val users = userRepository.getUsers()
            Log.d("@dev", "Users: $users")
            val user = userRemoteSource.getUser(1)
            Log.d("@dev", "User: $user")
        }.start()

    }
}