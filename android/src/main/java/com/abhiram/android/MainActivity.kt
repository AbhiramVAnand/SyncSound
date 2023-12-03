package com.abhiram.android

import android.media.AudioManager
import com.abhiram.common.App
import android.os.Bundle
import android.widget.MediaController.MediaPlayerControl
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                App()
            }
        }
    }
}