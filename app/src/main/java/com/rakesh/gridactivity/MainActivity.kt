package com.rakesh.gridactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView : GridView = findViewById(R.id.top_grid)
        gridView.adapter = GridAdapter(this)
    }
}