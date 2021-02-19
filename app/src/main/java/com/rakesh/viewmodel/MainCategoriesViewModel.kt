package com.rakesh.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rakesh.gridactivity.R
import com.rakesh.model.Category
import com.rakesh.model.CategoryItems

class MainCategoriesViewModel() : ViewModel() {

    val allCategories : MutableLiveData<MutableList<Category>> by lazy {
        MutableLiveData()
    }

    fun getList() {
        allCategories.value = mutableListOf(
                Category("All", R.drawable.ic_icon_material_all_inclusive),
                Category("Properties", R.drawable.ic_sale_house),
                Category("Grocery", R.drawable.ic_grocery_basket),
                Category("Home Care", R.drawable.ic_home_care),
                Category("Furniture & Garden", R.drawable.ic_furniture_and_garden),
                Category("Motors", R.drawable.ic_motors),
                Category("Mobile Phone & Devices", R.drawable.ic_mobile),
                Category("Jobs", R.drawable.ic_job),
                Category("Community", R.drawable.ic_community),
        )
    }
}

class CategoriesViewModel(val category:Category) : ViewModel() {
    val topItems : MutableLiveData<MutableList<CategoryItems>> by lazy {
        MutableLiveData()
    }

    fun getTopItems() {
        this.topItems.value = mutableListOf(
                CategoryItems("4 Bedroom Villa","SR 4,500", "Makka, Saudi Arabia"),
                CategoryItems("4 Bedroom Villa","SR 4,500", "Makka, Saudi Arabia"),
                CategoryItems("4 Bedroom Villa","SR 4,500", "Makka, Saudi Arabia"),
                CategoryItems("4 Bedroom Villa","SR 4,500", "Makka, Saudi Arabia"),
                CategoryItems("4 Bedroom Villa","SR 4,500", "Makka, Saudi Arabia")
        )
    }
}
