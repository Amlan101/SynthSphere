package com.example.musicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.adapter.View1Adapter
import com.example.musicapp.adapter.View2Adapter

class MainActivity : AppCompatActivity() {

    private lateinit var view1Adapter: View1Adapter
    private lateinit var view2Adapter: View2Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1: RecyclerView = findViewById(R.id.view1)
        val recyclerView2: RecyclerView = findViewById(R.id.view2)

        view1Adapter = View1Adapter()
        view2Adapter = View2Adapter()

        recyclerView1.adapter = view1Adapter
        recyclerView2.adapter = view2Adapter

        // Call DeezerAPI to fetch tracks
        val deezerAPI = com.example.musicapp.DeezerAPI
        deezerAPI.fetchTracksFromDeezer(this) { tracks ->
            runOnUiThread {
                tracks?.let {
                    // Update adapters with fetched tracks
                    view1Adapter.submitList(tracks.subList(0, minOf(tracks.size, 5))) // Example: Display first 5 tracks
                    view2Adapter.submitList(tracks.subList(5, minOf(tracks.size, 10))) // Example: Display next 5 tracks
                }
            }
        }
    }
}