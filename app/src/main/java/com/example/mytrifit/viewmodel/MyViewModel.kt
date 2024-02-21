package com.example.mytrifit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytrifit.model.Exercice
import com.example.mytrifit.model.Muscle
import com.example.mytrifit.model.allDataApp
import com.example.mytrifit.model.product.CoursProduct
import com.example.mytrifit.model.product.Product
import com.example.mytrifit.model.product.foodCompliment

open class MyViewModel : ViewModel() {
    var allDataAppp:allDataApp = allDataApp();
    var muscleLiveData:MutableLiveData<List<Muscle>> = MutableLiveData()
    var exerciceLiveData:MutableLiveData<List<Exercice>> = MutableLiveData()
    var foodComLiveData:MutableLiveData<List<foodCompliment>> = MutableLiveData()
    var CoursLiveData:MutableLiveData<List<CoursProduct>> = MutableLiveData()
    var coachingLiveData:MutableLiveData<List<Exercice>> = MutableLiveData()
    var cartLiveDataApp:MutableLiveData<List<Product>> = MutableLiveData()

    companion object{
        lateinit var myMuscle:Muscle;
        lateinit var context:String
    }
    fun setContext(con:String){
        context = con
    }

    fun getContext():String{
        return context
    }
    fun getMuscles(): List<Muscle>{
         return allDataAppp.muscleList
    }


    fun getMuscleMutableLiveData():MutableLiveData<List<Muscle>>{
        muscleLiveData.value = getMuscles();
        return muscleLiveData
    }

    fun getExercicesMutablLiveData():MutableLiveData<List<Exercice>>{
        exerciceLiveData.value = myMuscle.listExercice
        return exerciceLiveData
    }

    fun setExercice(muscle: Muscle){
      myMuscle = muscle
    }

    fun getFoodComplLiveData():MutableLiveData<List<foodCompliment>>{
        foodComLiveData.value = allDataAppp.foodComplimentList
        return foodComLiveData
    }
    fun getCoursComplLiveData():MutableLiveData<List<CoursProduct>>{
        CoursLiveData.value = allDataAppp.coursProduct
        return CoursLiveData
    }
    fun getCoachingMutablLiveData():MutableLiveData<List<Exercice>>{
        coachingLiveData.value = allDataAppp.coachingList
        return coachingLiveData
    }
    fun getCartMutablLiveData():MutableLiveData<List<Product>>{
        cartLiveDataApp.value = allDataApp.cartList1
        return cartLiveDataApp
    }

}