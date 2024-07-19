package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivitySignupBinding

class ActivitySignup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInTxt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            clearError()
            var formError = false
            val firstName = binding.tilFirstName.text.toString()
            if (firstName.isBlank()) {
                formError = true
                binding.etFirstName.error = "firstname is required"
            }


            val lastName = binding.tilLastName.text.toString()
            if (lastName.isBlank()) {
                formError = true
                binding.etLastName.error = "lastname is required"
            }


            val email = binding.tilEmail.text.toString()
            if (email.isBlank()) {
                formError = true
                binding.etEmail.error = "email required"
            }

            val password = binding.tilPassword.text.toString()
            if (password.isBlank()) {
                formError = true
                binding.etPassword.error = "password required"
            }
            val confirmPassword = binding.tilPassword.text.toString()
            if (confirmPassword.isBlank()) {
                formError = true
                binding.etConfirmPas.error = "password confirmation is required"
            }
            if (password != confirmPassword) {
                formError = true
                binding.etConfirmPas.error ="password and confirmation do not match"
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    fun validateRegistration() {

    }

    fun clearError() {
        binding.etFirstName.error = null
        binding.etLastName.error = null
        binding.etEmail.error = null
        binding.etPassword.error = null
        binding.etConfirmPas.error = null
    }
}


