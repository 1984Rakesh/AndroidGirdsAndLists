package com.rakesh.view

import android.content.Context
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController
import com.rakesh.fragment.CategoriesHomeFragmentDirections
import com.rakesh.gridactivity.R

class CategoryItemListItemView : LinearLayout {

    lateinit public var categoryItemImageView : ImageView
    lateinit public var priceTextView : TextView
    lateinit public var nameTextView : TextView
    lateinit public var locationTextView: TextView



    constructor(context: Context) : super(context) {
        initializeView(context)
    }

    fun initializeView(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.list_item_view_category_item, this)
        priceTextView = findViewById(R.id.category_item_price_text_view)
        categoryItemImageView = findViewById(R.id.category_item_view_image)

        categoryItemImageView.setImageResource(R.drawable.placeholder_category_item)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val action = CategoriesHomeFragmentDirections.actionCategoriesHomeFragmentToCategoryItemDetailsFragment()
        findNavController().navigate(action)
        return super.onTouchEvent(event)
    }
}