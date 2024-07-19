package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivityHomeBinding



class ActivityHome : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.btnQuiz.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }
        binding.btnVideo.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }
        binding.btnNotes.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }


    }
}