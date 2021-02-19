package com.rakesh.fragment

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.commit

import com.rakesh.gridactivity.R
import com.rakesh.viewmodel.MainCategoriesViewModel

class TopItemsInCategoryFragment : Fragment(R.layout.fragment_all_category_top_items_list) {

    private val viewModel : MainCategoriesViewModel by activityViewModels()
    private val linerLayout : LinearLayout? by lazy {
        view?.findViewById(R.id.top_items_category_list)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.allCategories.observe(::getLifecycle) {
            val fragManager : FragmentManager? = parentFragmentManager

            if (fragManager != null && linerLayout != null ) {
                val fragTransaction = fragManager.beginTransaction()
                for( category in it ) {
                    val id = linerLayout!!.id
                    fragTransaction.add(id, ItemsInCategoryFragment(category), category.name)
                }
                fragTransaction.commit()
            }
        }

        viewModel.getList()
    }
}