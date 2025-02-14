package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.phoenixapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.submit.setOnClickListener {
            validateRegistration()
            val intent = Intent(this, ActivityCorrection::class.java)
            startActivity(intent)

        }

    }


    fun validateRegistration() {
        clearErrors()
        var formError = false
        val firstName = binding.etQuiz1.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilQuiz1.error = "answer is required"
        }
        val lastName = binding.etQuiz2.text.toString()
        if (lastName.isBlank()) {
            formError = true
            binding.tilQuiz2.error = "answer is required"
        }

        val codeHiveId = binding.etQuiz3.text.toString()
        if (codeHiveId.isBlank()) {
            formError = true
            binding.tilQuiz3.error = "answer is required"
        }


        if (formError != true) {
            //Proceed to registration
        }

    }

    fun clearErrors() {
        binding.tilQuiz1.error = null
        binding.tilQuiz2.error = null
        binding.tilQuiz3.error = null

    }
}