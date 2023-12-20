package com.example.musicapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.adapter.View1Adapter
import com.example.musicapp.adapter.View2Adapter
import com.example.musicapp.models.Track

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewTracks: RecyclerView
    private lateinit var view1Adapter: View1Adapter
    private lateinit var view2Adapter: View2Adapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    private val trackList = arrayListOf(
        Track(1,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(2,"Kina Chir", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(3,"Chaleya", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(4,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(5,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(6,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(7,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(8,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(9,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
        Track(10,"Heeriye", "Arijit Singh", "3:59", R.drawable.lion_profile ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1: RecyclerView = findViewById(R.id.view1)
        val recyclerView2: RecyclerView = findViewById(R.id.view2)

        view1Adapter = View1Adapter(trackList)
        view2Adapter = View2Adapter(trackList)

        recyclerView1.adapter = view1Adapter
        recyclerView2.adapter = view2Adapter

        // This piece of code is used to add divider lines between the list items
//        recyclerView1.addItemDecoration(
//            DividerItemDecoration(
//                recyclerViewTracks.context,
//                (layoutManager as LinearLayoutManager).orientation
//            )
//        )
//        recyclerView2.addItemDecoration(
//            DividerItemDecoration(
//                recyclerViewTracks.context,
//                (layoutManager as LinearLayoutManager).orientation
//            )
//        )

    }
}