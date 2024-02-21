package com.example.mytrifit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.ui.adapters.DetailsProductAdapter
import com.example.mytrifit.viewmodel.MyViewModel

class cartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        var myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        val recyclerView: RecyclerView = findViewById(R.id.rcCart)
        val text:TextView = findViewById(R.id.cartText)

        recyclerView.layoutManager = GridLayoutManager(this,2)
        val detailsProductAdapters = DetailsProductAdapter(this, listOf())

        myViewModel.getCartMutablLiveData().observe(this,{
            if (it.size == 0){
                text.text = "nothing in cart !"
            }

                detailsProductAdapters.setList(it)

        })
        recyclerView.adapter = detailsProductAdapters
    }
}