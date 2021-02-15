package com.rakesh.gridactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rakesh.viewmodel.MainCategoriesViewModel

class MainActivity : AppCompatActivity() {
    val viewModel : MainCategoriesViewModel by lazy {
        MainCategoriesViewModel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView : GridView = findViewById(R.id.top_grid)
        gridView.adapter = GridAdapter(this)

        viewModel.allCategories.observe(::getLifecycle) {
            var adapter = gridView.adapter as GridAdapter
            adapter.categoryItems = it
        }

        viewModel.getList()

//        val layoutManager : LinearLayoutManager =  LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
//        val recyclerView : RecyclerView = findViewById(R.id.hlRecyclerView)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.itemAnimator = DefaultItemAnimator()
//        recyclerView.adapter = HorizontalListAdapter()
    }
}