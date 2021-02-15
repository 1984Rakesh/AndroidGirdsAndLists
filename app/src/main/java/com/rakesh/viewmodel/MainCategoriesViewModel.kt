package com.rakesh.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rakesh.gridactivity.R
import com.rakesh.model.Category

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
                Category("Furtniture & Garden", R.drawable.ic_furniture_and_garden),
                Category("Motors", R.drawable.ic_motors),
                Category("Mobile Phone & Devices", R.drawable.ic_mobile),
                Category("Jobs", R.drawable.ic_job),
                Category("Communinity", R.drawable.ic_community),
        )
    }
}
