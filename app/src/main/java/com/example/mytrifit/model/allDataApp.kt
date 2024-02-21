package com.example.mytrifit.model

import com.example.mytrifit.R

class allDataApp (
    var muscleList:List<Muscle> = mutableListOf(
        Muscle("Chest WorkOut",MuscelWorkOutLevel.HighLevel, R.drawable.chestfinl,true,55,
            mutableListOf(Exercice("Flat Bench Press",5,"8 - 12",4,R.drawable.benchpress),
                Exercice("Dumbbell Flyes",3,"12 - 15",3,R.drawable.dumbell),
                Exercice("Push-Ups",5,"To failure",3,R.drawable.pushups),
                Exercice("Chest Dips:",3,"8 - 12",4,R.drawable.chestdips),
                Exercice("incline BenchPr",4,"10 - 15",3,R.drawable.benchpress),
                Exercice("Cable Crossover",5,"8 - 12",4,R.drawable.cablecrossover),
                Exercice("Pec Deck",4,"8 - 12",4,R.drawable.pecdeck),
                Exercice("Decline BenchP",4,"10 - 15",3,R.drawable.benchpress),

            )
        ),
        Muscle("Back WorkOut",MuscelWorkOutLevel.HighLevel,R.drawable.backworkout,false,45,
            mutableListOf(
                Exercice("Deadlifts",5,"6 - 8",3,R.drawable.deadliftspng),
                Exercice("Pull-Ups",4,"8 - 12",3,R.drawable.pullup),
                Exercice("Lat Pulldowns",3,"10 - 12",3,R.drawable.latpulldown),
                Exercice("T-Bar Rows",5,"8 - 10",3,R.drawable.tbarrow),
                Exercice("Face Pulls",3,"12 - 15",3,R.drawable.facepullpng),
                Exercice("Seated Cable R",4,"10 - 12",3,R.drawable.saetedcabl),
                Exercice("Hyperextensions (B.E)",3,"12 - 15",3,R.drawable.hyperextension),
            )
            ),
        Muscle("Sholder WorkOut",MuscelWorkOutLevel.HighLevel,R.drawable.cholderworkout,false,40,
            mutableListOf(
                Exercice("Barbell Overhead P",5,"8 - 12",4,R.drawable.barbell),
                Exercice("Dumbbell Lateral R",4,"8 - 12",3,R.drawable.barbell),
                Exercice("upright rows",3,"10 - 12",3,R.drawable.uprightrowspng),
                )
            ),
        Muscle("Arm WorkOut",MuscelWorkOutLevel.MedLevel,R.drawable.armworkout,true,55,
            mutableListOf(
                Exercice("Barbell Bicep C",5,"8 - 12",4,R.drawable.deadliftspng),
                Exercice("Preacher Curls",4,"10 - 15",3,R.drawable.preachercurlbench),
                Exercice("EZ Bar Curl",3,"10 - 12",3,R.drawable.ezbarcurlpng),
                Exercice("Tricep Dips",2,"To failure or 10-15",3,R.drawable.tricepdipspng),
                )
            ),
        Muscle("Abdominal WorkOut",MuscelWorkOutLevel.LowLevel,R.drawable.abdominalworkout,true,30,
            mutableListOf(
                Exercice("Crunches:",5,"8 - 12",4,R.drawable.crunches),
                Exercice("Leg Raises:",4,"12 - 15",3,R.drawable.legraises),
                Exercice("Planks",3,"30-60 seconds",3,R.drawable.plankspng),
                Exercice("Russian Twists",2,"20 (10 twists per side)",3,R.drawable.russiantwists),
                Exercice("Side Planks",4,"20-40 seconds",3,R.drawable.sideplanks),
            )
            ),
        Muscle("Leg WorkOut",MuscelWorkOutLevel.MedLevel,R.drawable.legworkout,true,35,
            mutableListOf(
                Exercice("Deadlifts",5,"6 - 8",3,R.drawable.deadliftspng),
                Exercice("Leg Press:",3,"8 - 12",4,R.drawable.crunches),
                Exercice("Leg Raises:",4,"10 - 15",3,R.drawable.legraises),
                Exercice("Leg Extensions",3,"12 - 15",3,R.drawable.leg),
                Exercice("Calf Raises:",3,"15 - 20",3,R.drawable.calfraises),
            )),
        Muscle("Core WorkOut",MuscelWorkOutLevel.LowLevel,R.drawable.coreworkout,false,35,
            ),
        Muscle("CardioVascular",MuscelWorkOutLevel.MedLevel,R.drawable.cardio,true,30),

    )
){
}