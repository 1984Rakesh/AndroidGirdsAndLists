package com.rakesh.gridactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.rakesh.viewmodel.MainCategoriesViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val layoutManager : LinearLayoutManager =  LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
//        val recyclerView : RecyclerView = findViewById(R.id.hlRecyclerView)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.itemAnimator = DefaultItemAnimator()
//        recyclerView.adapter = HorizontalListAdapter()
    }
}