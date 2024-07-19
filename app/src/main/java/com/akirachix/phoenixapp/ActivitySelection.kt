package com.akirachix.phoenixapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.phoenixapp.databinding.ActivitySelectionBinding


class ActivitySelection : AppCompatActivity() {
    lateinit var binding: ActivitySelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySelectionBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}