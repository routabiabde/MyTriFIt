package com.example.mytrifit.model

import android.graphics.drawable.Drawable

data class Muscle(var nomMuscle:String,var muscelWorkOutLevel: MuscelWorkOutLevel,
                  var background:Int,var isFullWorkOut : Boolean,
                  var time:Int,var listExercice:List<Exercice> = mutableListOf());

