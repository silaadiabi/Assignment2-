package com.example.dog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class second : AppCompatActivity() {

    private var feedCount = 0
    private var playCount = 0
    private var cleanCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val feedButton = findViewById<Button>(R.id.FEED)
        val playButton = findViewById<Button>(R.id.PLAY)
        val cleanButton = findViewById<Button>(R.id.CLEAN)
        val feedTextView = findViewById<TextView>(R.id.Feed)
        val playTextView = findViewById<TextView>(R.id.Hunger)
        val cleanTextView = findViewById<TextView>(R.id.happy)
        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView4)

        feedButton.setOnClickListener {
            feedCount++
            feedCount<=10
            feedTextView.text = feedCount.toString()
            textView.text = "dog is eating"
            imageView.setImageDrawable(getDrawable(R.drawable.pet1))
        }

        playButton.setOnClickListener {
            playCount++
            playCount<=10
            playTextView.text = playCount.toString()
            textView.text = "dog is playing"
            imageView.setImageDrawable(getDrawable(R.drawable.pet2))
        }

        cleanButton.setOnClickListener {
            cleanCount++
            cleanTextView.text = cleanCount.toString()
            textView.text = "dog is cleaning"
            imageView.setImageDrawable(getDrawable(R.drawable.pet3))
        }
    }
}
