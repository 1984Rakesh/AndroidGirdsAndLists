package com.rakesh.gridactivity

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rakesh.model.CategoryItems
import com.rakesh.view.CategoryItemListItemView
import com.rakesh.view.CategoryView

class HorizontalListAdapter :
    RecyclerView.Adapter<HorizontalListAdapter.GridItemViewRecyclerViewHolder>() {
    class GridItemViewRecyclerViewHolder(val categoryItemsView: CategoryItemListItemView) :
        RecyclerView.ViewHolder(categoryItemsView) {

    }

    var categoryItems : MutableList<CategoryItems>? = null

    fun getItem(position: Int): Any {
        return categoryItems?.get(position)!!
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridItemViewRecyclerViewHolder {
        val categoryItemsView = CategoryItemListItemView(parent.context)
        return GridItemViewRecyclerViewHolder(categoryItemsView)
    }

    override fun onBindViewHolder(holder: GridItemViewRecyclerViewHolder, position: Int) {
        val item = getItem(position) as CategoryItems
        val categoryItemsView = holder.categoryItemsView
        categoryItemsView.priceTextView.text = item.price
    }

    override fun getItemCount(): Int {
        return categoryItems?.size ?: 0
    }
}