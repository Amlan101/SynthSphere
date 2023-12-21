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
        Track(1,"Chaleya", "Anirudh", "3:59", R.drawable.chaleya_cover ),
        Track(2,"Rangisari", "Kanishk Seth", "3:59", R.drawable.rangisari_cover ),
        Track(3,"Janiye", "Vishal Mishra", "3:59", R.drawable.janiye_cover ),
        Track(4,"One Love", "Shubh", "3:59", R.drawable.one_love_cover ),
        Track(5,"What Jhumka?", " Pritam", "3:59", R.drawable.what_jhumka_cover ),
        Track(6,"Tere Vaaste", " Varun Jain", "3:59", R.drawable.tere_vaaste_cover ),
        Track(7,"Satarang", "Arijit Singh", "3:59", R.drawable.satranga_cover ),
        Track(8,"Malang Sajna", "Sachet Tandon", "3:59", R.drawable.maalang_sajna_cover ),
        Track(9,"Kina Chir ", "PropheC", "3:59", R.drawable.kina_chir_cover ),
        Track(10,"Gul ", "Anuv Jain", "3:59", R.drawable.gul_cover ),
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

        // Setting the layout manager for RecyclerViews
        val layoutManager1 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.layoutManager = layoutManager1

        val layoutManager2 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = layoutManager2



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