package com.rakesh.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rakesh.gridactivity.HorizontalListAdapter
import com.rakesh.gridactivity.R
import com.rakesh.model.Category
import com.rakesh.viewmodel.CategoriesViewModel

class ItemsInCategoryFragment(var category:Category) : Fragment(R.layout.fragment_items_in_category) {
    private val viewModel: CategoriesViewModel by lazy {
        CategoriesViewModel(category)
    }

    private val titleTextView : TextView? by lazy {
        view?.findViewById(R.id.category_item_list_name)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        titleTextView?.text = "Top in ${category.name}"

        val layoutManager : LinearLayoutManager =  LinearLayoutManager(view.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val recyclerView : RecyclerView = view.findViewById(R.id.hlRecyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()

        val adapter = HorizontalListAdapter()
        recyclerView.adapter = adapter

        viewModel.topItems.observe(::getLifecycle) {
            adapter.categoryItems = it
        }

        viewModel.getTopItems()
    }
}