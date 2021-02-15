package com.rakesh.gridactivity

import android.content.Context
import android.content.res.Resources
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

public class GridAdapter : BaseAdapter {
    class CategoryItem(var name: String, var imageResId: Int) {
    }

    private val categoryItems : List<GridAdapter.CategoryItem> = mutableListOf(
            CategoryItem("All",R.drawable.ic_icon_material_all_inclusive),
            CategoryItem("Properties",R.drawable.ic_sale_house),
            CategoryItem("Grocery",R.drawable.ic_grocery_basket),
            CategoryItem("Home Care",R.drawable.ic_home_care),
            CategoryItem("Furtniture & Garden",R.drawable.ic_furniture_and_garden),
            CategoryItem("Motors",R.drawable.ic_motors),
            CategoryItem("Mobile Phone & Devices",R.drawable.ic_mobile),
            CategoryItem("Jobs",R.drawable.ic_job),
            CategoryItem("Communinity",R.drawable.ic_community),
    )

    private val context : Context

    constructor(context: Context){
        this.context = context
    }

    override fun getCount(): Int {
        return  categoryItems.size
    }

    override fun getItem(position: Int): Any {
        return categoryItems.get(position)
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

        var categoryItem : CategoryItem = getItem(position) as CategoryItem
        gridItemView.textView.text = categoryItem.name.toUpperCase()
        gridItemView.imageView.setImageResource(categoryItem.imageResId)

        return gridItemView
    }

}