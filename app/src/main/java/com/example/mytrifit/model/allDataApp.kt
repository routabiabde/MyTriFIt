package com.example.mytrifit.model

class allDataApp (
    var muscleList:List<Muscle> = mutableListOf(
        Muscle("Chest WorkOut",MuscelWorkOutLevel.HighLevel,true,55),
        Muscle("Back WorkOut",MuscelWorkOutLevel.HighLevel,false,45),
        Muscle("Sholder WorkOut",MuscelWorkOutLevel.HighLevel,false,40),
        Muscle("Arm WorkOut",MuscelWorkOutLevel.MedLevel,true,55),
        Muscle("Abdominal WorkOut",MuscelWorkOutLevel.LowLevel,true,30),
        Muscle("Leg WorkOut",MuscelWorkOutLevel.MedLevel,true,35),
        Muscle("Core WorkOut",MuscelWorkOutLevel.LowLevel,false,35),
        Muscle("CardioVascular",MuscelWorkOutLevel.MedLevel,true,30),
        Muscle("Forearm WorkOut",MuscelWorkOutLevel.LowLevel,false,35)
    )
){
}