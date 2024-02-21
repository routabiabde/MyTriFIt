package com.example.mytrifit.ui

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.mytrifit.R
import com.example.mytrifit.viewmodel.MyViewModel


class discountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discount, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         var btnToCart:ImageButton = view.findViewById(R.id.addToCard)
         var foodInclud:View = view.findViewById(R.id.foodCompl)
         var coursInclud:View = view.findViewById(R.id.cors)
         var coachingInclud:View = view.findViewById(R.id.coaching)
         var myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)


         foodInclud.setOnClickListener{
            var i = Intent(context,detailsProduct::class.java)
             myViewModel.setContext("foodContext")
             startActivity(i)
         }

        coursInclud.setOnClickListener{
            var i = Intent(context,detailsProduct::class.java)
            myViewModel.setContext("coursContext")
            startActivity(i)
        }

        coachingInclud.setOnClickListener{
            var i = Intent(context,detailsProduct::class.java)
            myViewModel.setContext("coachingContext")
            startActivity(i)
        }

        btnToCart.setOnClickListener {
            var i = Intent(context,cartActivity::class.java)
            startActivity(i)
        }
    }


}