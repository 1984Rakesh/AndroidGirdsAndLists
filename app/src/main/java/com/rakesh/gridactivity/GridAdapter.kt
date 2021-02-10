package com.rakesh.gridactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

public class GridAdapter : BaseAdapter {
    private val context : Context

    constructor(context: Context){
        this.context = context
    }

    override fun getCount(): Int {
        return  9
    }

    override fun getItem(position: Int): Any {
        return "Item"
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var gridItemView : GridItemView

        if( convertView != null ){
            gridItemView = convertView as GridItemView
        }
        else {
            gridItemView = GridItemView(context)
        }

        gridItemView.textView.text = "Item"
        gridItemView.imageView.setImageResource(R.drawable.ic_truck)

        return gridItemView
    }

}