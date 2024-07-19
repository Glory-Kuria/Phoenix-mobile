package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.phoenixapp.databinding.ActivityContentNotesBinding
import com.akirachix.phoenixapp.databinding.ActivityContentVideosBinding

class ActivityContentVideos : AppCompatActivity() {
    lateinit var binding: ActivityContentVideosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_content_videos)
        binding= ActivityContentVideosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSection.setOnClickListener {
            val intent= Intent(this,ActivitySelection::class.java)
            startActivity(intent)
        }
        binding.ivVideo4.setOnClickListener {
            val intent= Intent(this,ActivitySelection::class.java)
            startActivity(intent)
        }

        binding.ivChatbot4.setOnClickListener {
            val intent= Intent(this,ActivityAskRafiki::class.java)
            startActivity(intent)
        }
        binding.ivChatbot4.setOnClickListener {
            val intent= Intent(this,ActivityAskRafiki::class.java)
            startActivity(intent)
        }
    }
}