package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.accountSignUp.setOnClickListener {
            val intent=Intent(this,ActivitySignup::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            clearError()
            var formError = false
            val email = binding.tilEmailSignIn.text.toString()
            if (email.isBlank()) {
                formError = true
                binding.etSignInEmail.error = "email is required"
            }


            val signInPassword= binding.tilSignInPassword.text.toString()
            if (signInPassword.isBlank()) {
                formError = true
                binding.etSignInPassword.error = "password is required"
            } else{
                val intent=Intent(this,ActivityHome::class.java)
                startActivity(intent)

            }


        }
    }


    fun clearError(){
        binding.etSignInEmail.error=null
        binding.etSignInPassword.error=null
    }}








