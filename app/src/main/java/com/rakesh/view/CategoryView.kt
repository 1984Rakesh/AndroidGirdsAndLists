package com.rakesh.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.rakesh.gridactivity.R

public class CategoryView : ConstraintLayout {
    lateinit public var imageView : ImageView
    lateinit public var textView : TextView

    constructor(context: Context) : super(context) {
        initializeView(context)
    }

    constructor(context: Context, attributes: AttributeSet) : super(context,attributes) {
        initializeView(context)
    }

    fun initializeView(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.grid_item_view_category, this)
        imageView = findViewById(R.id.grid_item_view_image)
        textView = findViewById(R.id.grid_item_view_text)
    }
}