package com.rakesh.gridactivity

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rakesh.model.Category

class HorizontalListAdapter :
    RecyclerView.Adapter<HorizontalListAdapter.GridItemViewRecyclerViewHolder>() {
    class GridItemViewRecyclerViewHolder(val categoryItemsView: CategoryItemsView) :
        RecyclerView.ViewHolder(categoryItemsView) {

    }

    var categoryItems : MutableList<Category>? = null

    fun getItem(position: Int): Any {
        return categoryItems?.get(position)!!
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridItemViewRecyclerViewHolder {
        val categoryItemsView = CategoryItemsView(parent.context)
        return GridItemViewRecyclerViewHolder(categoryItemsView)
    }

    override fun onBindViewHolder(holder: GridItemViewRecyclerViewHolder, position: Int) {
        val item = getItem(position) as Category
        val categoryItemsView = holder.categoryItemsView
        categoryItemsView.headerTextView.text = "Top at ${item.name}"
    }

    override fun getItemCount(): Int {
        return categoryItems?.size ?: 0
    }
}