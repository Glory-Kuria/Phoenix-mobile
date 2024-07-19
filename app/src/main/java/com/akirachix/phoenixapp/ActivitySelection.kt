package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivitySelectionBinding


class ActivitySelection : AppCompatActivity() {
    lateinit var binding: ActivitySelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySelectionBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.blueTwo.setOnClickListener {
            val intent= Intent(this,ActivityContentNotes::class.java)
            startActivity(intent)
        }
        binding.blueOne.setOnClickListener {
            val intent= Intent(this,ActivityContentVideos::class.java)
            startActivity(intent)
        }
    }

}