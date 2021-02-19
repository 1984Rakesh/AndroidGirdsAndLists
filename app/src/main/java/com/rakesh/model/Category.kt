package com.rakesh.model

public class Category(var name: String,
                      var imageResId: Int,
                      var topItems:MutableList<CategoryItems>?) {
    constructor(name: String, imageResId: Int) : this(name, imageResId, null)
}