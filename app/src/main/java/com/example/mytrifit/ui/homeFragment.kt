package com.example.mytrifit.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.viewmodel.MyViewModel
import com.example.mytrifit.R
import com.example.mytrifit.model.Exercice
import com.example.mytrifit.model.Muscle
import com.example.mytrifit.ui.adapters.MuscleAdapter


class homeFragment : Fragment() {

    lateinit var muscleAdapter:MuscleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =   inflater.inflate(R.layout.fragment_home, container, false)

        return v;

    }
;   lateinit var myViewModel: MyViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView:RecyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        myViewModel =  ViewModelProvider(this).get(MyViewModel::class.java)


        // this RecyclerView will use.
        val itemAdapter= MuscleAdapter(requireContext(), listOf() ,object : MuscleAdapter.OnItemClickListener{

            override fun onItemClick(muscle: Muscle) {
                myViewModel.setExercice(muscle)
                var i:Intent  = Intent(context,ExercicesActivity::class.java)
                startActivity(i)
            }
        }) ;



        myViewModel.getMuscleMutableLiveData().observe(viewLifecycleOwner, Observer { value ->
            itemAdapter.setMuscleListt(value)
        })






        recyclerView.adapter = itemAdapter


    }


}