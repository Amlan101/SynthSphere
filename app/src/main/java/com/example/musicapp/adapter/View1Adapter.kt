package com.example.musicapp.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.models.Track

class View1Adapter(private val tracks: ArrayList<Track>) : RecyclerView.Adapter<View1Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Implement onCreateViewHolder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_track, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Implement onBindViewHolder to bind data to views
        val track = tracks[position]
        holder.coverImageView.setImageResource(track.cover)
        holder.titleTextView.text = track.title
        holder.artistTextView.text = track.artist
    }

    override fun getItemCount(): Int {
        return tracks.size
    }

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

     val coverImageView: ImageView = itemView.findViewById(R.id.imageViewTrack)
     val titleTextView: TextView = itemView.findViewById(R.id.textViewSong)
     val artistTextView: TextView = itemView.findViewById(R.id.textViewArtist)

    }
}