package com.example.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.example.codeswag.Adapter.CategoryAdapter
import com.example.codeswag.Adapter.CategoryRecycleAdapter
import com.example.codeswag.Model.Category
import com.example.codeswag.R
import com.example.codeswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

       val  layoutManage = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManage
        categoryListView.setHasFixedSize(true)


    }
}
