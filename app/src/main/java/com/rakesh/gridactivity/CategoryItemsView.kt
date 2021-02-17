package com.rakesh.gridactivity

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class CategoryItemsView : ConstraintLayout {
    lateinit public var headerTextView : TextView

    constructor(context: Context) : super(context) {
        initializeView(context)
    }

    constructor(context: Context, attributes: AttributeSet) : super(context,attributes) {
        initializeView(context)
    }

    fun initializeView(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.category_items, this)
        headerTextView = findViewById(R.id.items_category_header_text)
    }
}