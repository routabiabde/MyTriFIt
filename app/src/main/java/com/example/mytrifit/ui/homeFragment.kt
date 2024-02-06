package com.example.mytrifit.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.MuscelWorkOutLevel
import com.example.mytrifit.model.Muscle
import com.example.mytrifit.model.allDataApp
import com.example.mytrifit.ui.adapters.MuscleAdapter


class homeFragment : Fragment() {

    lateinit var muscleAdapter:MuscleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =   inflater.inflate(R.layout.fragment_home, container, false)
        var recyclerView: RecyclerView  = v?.findViewById(R.id.recyclerView)!!;
        setRecyclerView(recyclerView)
        return v;

    }
;
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // getting the employeelist


        // Assign employeelist to ItemAdapter

        val allDataApp = allDataApp();
        val muscleList:List<Muscle>  = allDataApp.muscleList;
        // Set the LayoutManager that
        // this RecyclerView will use.
         val itemAdapter= MuscleAdapter(requireContext(),muscleList) ;
        val recyclerView:RecyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // adapter instance is set to the
        // recyclerview to inflate the items.
        recyclerView.adapter = itemAdapter

    }

   public fun setRecyclerView(rcView: RecyclerView){

   }

}