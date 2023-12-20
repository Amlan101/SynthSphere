package com.example.musicapp

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.musicapp.models.Track
import org.json.JSONArray

object DeezerAPI {

    private const val DEEZER_API_URL = "https://api.deezer.com/"

    fun fetchTracksFromDeezer(context: Context, callback: (List<Track>?) -> Unit) {
        val queue = Volley.newRequestQueue(context)

        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET, "$DEEZER_API_URL/your-endpoint", null,
            { response ->
                val tracks = parseTracks(response)
                callback(tracks)
            },
            { error ->
                callback(null)
            })

        queue.add(jsonArrayRequest)
    }


    private fun parseTracks(response: JSONArray): List<Track> {
        val tracksList = mutableListOf<Track>()

        for (i in 0 until response.length()) {
            val trackObject = response.getJSONObject(i)
            val id = trackObject.getString("id")
            val title = trackObject.getString("title")
            val artistObject = trackObject.getJSONObject("artist")
            val artist = artistObject.getString("name")

            // You can extract other necessary properties similarly

            val track = Track(id, title, artist)
            tracksList.add(track)
        }

        return tracksList
    }

}
