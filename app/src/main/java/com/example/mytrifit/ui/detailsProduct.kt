package com.example.mytrifit.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.Exercice
import com.example.mytrifit.model.allDataApp
import com.example.mytrifit.ui.adapters.DetailsProductAdapter
import com.example.mytrifit.ui.adapters.ExerciseAdapter
import com.example.mytrifit.viewmodel.MyViewModel

class detailsProduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_product)

        var myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        val recyclerView: RecyclerView = findViewById(R.id.rcDetailProd)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        val detailsProductAdapters = DetailsProductAdapter(this, listOf())
        val coachingAdapter:ExerciseAdapter ;

         when(myViewModel.getContext()){
              "foodContext"->  myViewModel.getFoodComplLiveData().observe(this,{
                  detailsProductAdapters.setList(it)
              })
             "coursContext" ->  myViewModel.getCoursComplLiveData().observe(this,{
                 detailsProductAdapters.setList(it)
             })
             else ->  {
                 recyclerView.layoutManager = LinearLayoutManager(this)
                 coachingAdapter = ExerciseAdapter(listOf(),object: ExerciseAdapter.OnItemClickListener1 {
                 override fun onItemClick(exercice: Exercice) {
                     val phoneNumber = exercice.rep

                     // Create an Intent to dial the phone number
                     val dialIntent = Intent(Intent.ACTION_DIAL)
                     dialIntent.data = Uri.parse("tel:$phoneNumber")

                     // Check if there's a dialer app available before launching the Intent

                         startActivity(dialIntent)

                 }
             });
             myViewModel.getCoachingMutablLiveData().observe(this,{
                 coachingAdapter.setExerciceList(it)
                 recyclerView.adapter = coachingAdapter

             })}

         }

        recyclerView.adapter = detailsProductAdapters

    }

    }


