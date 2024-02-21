package com.example.mytrifit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.Exercice
import com.example.mytrifit.model.allDataApp

import com.example.mytrifit.ui.adapters.ExerciseAdapter
import com.example.mytrifit.viewmodel.MyViewModel

class ExercicesActivity : AppCompatActivity() {


    var allDataApp = allDataApp()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercices)

        val recyclerView: RecyclerView = findViewById(R.id.rcExercice);
        recyclerView.layoutManager = LinearLayoutManager(this)
        val myViewModel:MyViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        val exerciceAdapter: ExerciseAdapter = ExerciseAdapter(listOf(),object  : ExerciseAdapter.OnItemClickListener1{
            override fun onItemClick(exercice: Exercice) {
                TODO("Not yet implemented")
            }

        })

        myViewModel.getExercicesMutablLiveData().observe(this, Observer {value->
            exerciceAdapter.setExerciceList(value)
        })


         recyclerView.adapter = exerciceAdapter
    }


}