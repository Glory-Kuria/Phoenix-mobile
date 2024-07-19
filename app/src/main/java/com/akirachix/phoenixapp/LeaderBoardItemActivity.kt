package com.akirachix.phoenixapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.phoenixapp.databinding.ActivityContentNotesBinding
import com.akirachix.phoenixapp.databinding.ActivityContentVideosBinding
import com.akirachix.phoenixapp.databinding.ActivityLeaderBoardItemBinding

class LeaderboardItemActivity : AppCompatActivity() {
    lateinit var binding: ActivityLeaderBoardItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board_item)
        binding= ActivityLeaderBoardItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivBoard4.setOnClickListener {
            val intent= Intent(this,LeaderboardItemActivity::class.java)
            startActivity(intent)
        }
        binding.ivBoard4.setOnClickListener {
            val intent= Intent(this,ActivityContentNotes::class.java)
            startActivity(intent)
        }


    }
}