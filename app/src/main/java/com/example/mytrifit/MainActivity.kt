package com.example.mytrifit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mytrifit.databinding.ActivityMainBinding
import com.example.mytrifit.ui.discountFragment
import com.example.mytrifit.ui.homeFragment
import com.example.mytrifit.ui.mapFragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;
    private lateinit var topNavBar : MaterialToolbar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        //top Navigation Bar
        topNavBar = findViewById(R.id.topBar);
        topNavBar.setNavigationOnClickListener {
            Toast.makeText(applicationContext,"icon User Clicked",Toast.LENGTH_SHORT).show()

        }
      topNavBar.setOnMenuItemClickListener { menuItem->
          when(menuItem.itemId){
              R.id.settings ->{
                  Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
                }
              R.id.notif ->{
                  Toast.makeText(this,"notif",Toast.LENGTH_SHORT).show()


              }
              R.id.Help -> {
                  Toast.makeText(this,"notif",Toast.LENGTH_SHORT).show()


              }
          }
          true
      }












        // replace Fragment
        replaceFragment(homeFragment());
        binding.bottomMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home ->  replaceFragment(homeFragment());
                R.id.map ->  replaceFragment(mapFragment());
                R.id.discount -> replaceFragment(discountFragment());
                else -> {}
            }
            true
        }


    }












 // fun pour remplacer fragmnet
    fun replaceFragment(fragment : Fragment){
          val fragmentManager = supportFragmentManager;
          val framentTransaction = fragmentManager.beginTransaction()
          framentTransaction.replace(R.id.fragment,fragment);
          framentTransaction.commit()

    }
}