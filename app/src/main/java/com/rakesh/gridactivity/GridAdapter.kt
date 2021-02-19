package com.rakesh.gridactivity

import com.rakesh.model.Category
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.rakesh.view.CategoryView

public class GridAdapter : BaseAdapter {
    private val context : Context
    var categoryItems : MutableList<Category>? = null


    constructor(context: Context){
        this.context = context
    }

    override fun getCount(): Int {
        return categoryItems?.size ?: 0
    }

    override fun getItem(position: Int): Any {
        return categoryItems?.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var gridItemView : CategoryView

        if( convertView != null ){
            gridItemView = convertView as CategoryView
        }
        else {
            gridItemView = CategoryView(context)
        }

        var categoryItem : Category = getItem(position) as Category
        gridItemView.textView.text = categoryItem.name.toUpperCase()
        gridItemView.imageView.setImageResource(categoryItem.imageResId)

        return gridItemView
    }

}