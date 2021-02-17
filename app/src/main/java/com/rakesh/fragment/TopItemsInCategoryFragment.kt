package com.rakesh.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import com.rakesh.gridactivity.HorizontalListAdapter
import com.rakesh.gridactivity.R
import com.rakesh.viewmodel.MainCategoriesViewModel

class TopItemsInCategoryFragment : Fragment(R.layout.fragment_top_items_in_category) {

    val viewModel : MainCategoriesViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager : LinearLayoutManager =  LinearLayoutManager(view.context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val recyclerView : RecyclerView = view.findViewById(R.id.hlRecyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()

        val adapter = HorizontalListAdapter()
        recyclerView.adapter = adapter

        viewModel.allCategories.observe(::getLifecycle) {
            adapter.categoryItems = it
        }
    }
}