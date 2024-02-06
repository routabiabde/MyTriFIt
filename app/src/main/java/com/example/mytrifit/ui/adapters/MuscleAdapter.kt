package com.example.mytrifit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.Muscle

class MuscleAdapter (val context:Context ,val muscleList:List<Muscle>) :
    RecyclerView.Adapter<MuscleAdapter.MuscleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuscleViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.muscle_view,parent,false);
        return MuscleViewHolder(view);
    }

    override fun getItemCount(): Int {
       return muscleList.size;
    }

    override fun onBindViewHolder(holder: MuscleViewHolder, position: Int) {
        var muscle = muscleList.get(position);
        holder.muscleNameTv.text = muscle.nomMuscle ;
        holder.muscleLevelTv.text = muscle.muscelWorkOutLevel.toString();
        var isFullWorkOutStr:String;
        when(muscle.isFullWorkOut){
            true->  isFullWorkOutStr = "Full Work Out"
            else->{
                isFullWorkOutStr = "not Full Work Out"
            }
        }
        holder.isFullWorkOutTv.text = isFullWorkOutStr;
        holder.timeWorkTv.text = "Total time " + muscle.time + " min";
    }
     class MuscleViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
         val timeWorkTv:TextView = itemView.findViewById(R.id.timeWork)!!;
         val muscleLevelTv:TextView = itemView.findViewById(R.id.work_level)!!;
         val muscleNameTv:TextView = itemView.findViewById(R.id.muscle_name)!!;
         val isFullWorkOutTv:TextView = itemView.findViewById(R.id.isFullWork)!!;

     }
}