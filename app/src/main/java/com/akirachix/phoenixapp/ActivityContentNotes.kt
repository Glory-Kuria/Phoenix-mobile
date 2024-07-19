package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.phoenixapp.databinding.ActivityContentNotesBinding
import com.akirachix.phoenixapp.databinding.ActivityMainBinding

class ActivityContentNotes : AppCompatActivity() {
    lateinit var binding: ActivityContentNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContentNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnChangeTopic.setOnClickListener {
            val intent=Intent(this,ActivitySelection::class.java)
            startActivity(intent)

        }
        binding.ivHome4.setOnClickListener {
            val intent=Intent(this,ActivityHome::class.java)
            startActivity(intent)

        }
        binding.btnReadMore.setOnClickListener {
            val intent= Intent(this,SummaryActivity::class.java)
            startActivity(intent)
        }
        binding.ivRight.setOnClickListener {
            val intent= Intent(this,ActivityHome::class.java)
            startActivity(intent)
        }

    }
}