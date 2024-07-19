package com.akirachix.phoenixapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivityAskRafikiBinding


class ActivityAskRafiki : AppCompatActivity() {

    lateinit var binding: ActivityAskRafikiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAskRafikiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, ResponseActivity::class. java)
            startActivity(intent)
        }
        binding.btnSubmit.setOnClickListener {
            validate()
        }
    }


    fun validate() {
        clearErrors()
        var oneError = false
        val answer = binding.etAnswer.text.toString()
        if (answer.isBlank()) {
            oneError = true
            binding.etAnswer.error = "answer is required"

        }
        if (!oneError) {
            //Proceed to registration
        }
    }

    private fun clearErrors() {
        binding.textInputLayout.error = null
    }
}


