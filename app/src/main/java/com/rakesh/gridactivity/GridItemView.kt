package com.rakesh.gridactivity

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

public class GridItemView : ConstraintLayout {
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
        inflater.inflate(R.layout.grid_item_view, this)
        imageView = findViewById(R.id.grid_item_view_image)
        textView = findViewById(R.id.grid_item_view_text)
    }
}