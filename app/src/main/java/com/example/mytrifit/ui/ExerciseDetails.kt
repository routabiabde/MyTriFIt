package com.example.mytrifit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytrifit.R
import com.google.android.youtube.player.YouTubePlayerView

class ExerciseDetails : AppCompatActivity(), YouTubePlayer.OnInitializedListener {
    private val GOOGLE_API_KEY = "YOUR_API_KEY"
    private val VIDEO_ID = "YOUR_VIDEO_ID"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_details)

        val youTubePlayerView = findViewById<YouTubePlayerView>(R.id.youtube_player_view)
        youTubePlayerView.initialize(GOOGLE_API_KEY, this)
    }

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider, player: YouTubePlayer, wasRestored: Boolean) {
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID)
        }
    }

    override fun onInitializationFailure(provider: YouTubePlayer.Provider, error: YouTubeInitializationResult) {
        // Handle error
    }
}

class YouTubePlayer {

}
