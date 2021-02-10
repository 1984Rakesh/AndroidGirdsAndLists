package com.rakesh.gridactivity

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalListAdapter :
    RecyclerView.Adapter<HorizontalListAdapter.GridItemViewRecyclerViewHolder>() {
    class GridItemViewRecyclerViewHolder(val girdItemView: GridItemView) :
        RecyclerView.ViewHolder(girdItemView) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridItemViewRecyclerViewHolder {
        val gridItemView = GridItemView(parent.context)
        return GridItemViewRecyclerViewHolder(gridItemView)
    }

    override fun onBindViewHolder(holder: GridItemViewRecyclerViewHolder, position: Int) {
        val gridItemView = holder.girdItemView
        gridItemView.textView.text = "Item"
        gridItemView.imageView.setImageResource(R.drawable.ic_truck)
    }

    override fun getItemCount(): Int {
        return 10
    }
}