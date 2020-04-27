package com.example.workingwithaudios

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val relativeLayout = findViewById<RelativeLayout>(R.id.layotu_parent)


        val animationDrawable = relativeLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(3000)
        animationDrawable.setExitFadeDuration(1000)
        animationDrawable.start()


    }


    fun play_btn(view: View) {
        val sound = view as Button

        val mediaPlayer = MediaPlayer.create(this@MainActivity,Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.start()

        if (mediaPlayer.isPlaying) {
            sound.setBackgroundColor(Color.RED)
        }




        mediaPlayer.setOnCompletionListener {
            sound.setBackgroundColor(Color.GREEN)
            sound.setTextColor(Color.WHITE)
        }

    }


    }

