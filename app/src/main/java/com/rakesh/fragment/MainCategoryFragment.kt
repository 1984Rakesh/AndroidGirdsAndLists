package com.rakesh.fragment

import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.rakesh.gridactivity.GridAdapter
import com.rakesh.gridactivity.R
import com.rakesh.viewmodel.MainCategoriesViewModel

class MainCategoryFragment : Fragment(R.layout.fragment_main_categories_grid_view) {
    private val viewModel : MainCategoriesViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gridView : GridView = view.findViewById(R.id.top_grid)
        gridView.adapter = GridAdapter(view.context)

        viewModel.allCategories.observe(::getLifecycle) {
            var adapter = gridView.adapter as GridAdapter
            adapter.categoryItems = it
        }

        viewModel.getList()
    }
}