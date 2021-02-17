package com.rakesh.gridactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.rakesh.viewmodel.MainCategoriesViewModel

class MainActivity : AppCompatActivity() {

    private val categoriesViewModel: MainCategoriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoriesViewModel.getList()
    }
}