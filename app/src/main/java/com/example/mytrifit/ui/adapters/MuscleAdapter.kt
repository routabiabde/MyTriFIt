package com.example.mytrifit.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.Exercice
import com.example.mytrifit.model.Muscle

class MuscleAdapter (val context:Context ,var muscleList:List<Muscle>,private val listener: OnItemClickListener) :
    RecyclerView.Adapter<MuscleAdapter.MuscleViewHolder>() {

    fun setMuscleListt(muscleList:List<Muscle>){
        this.muscleList = muscleList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuscleViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.muscle_view,parent,false);
        return MuscleViewHolder(view);
    }


    init {

    }
    override fun getItemCount(): Int {
       return muscleList.size;
    }
    interface OnItemClickListener {
        fun onItemClick(muscle: Muscle)
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
        holder.image.setImageResource(muscle.background)

    }
     inner class MuscleViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
         val timeWorkTv:TextView = itemView.findViewById(R.id.timeWork)!!;
         val muscleLevelTv:TextView = itemView.findViewById(R.id.work_level)!!;
         val muscleNameTv:TextView = itemView.findViewById(R.id.muscle_name)!!;
         val isFullWorkOutTv:TextView = itemView.findViewById(R.id.isFullWork)!!;
         var image:ImageView = itemView.findViewById(R.id.back_pic);
         init {
             itemView.setOnClickListener {
                 val position = adapterPosition
                 var muscle = muscleList.get(position);
                 if (position != RecyclerView.NO_POSITION) {
                     listener.onItemClick(muscle)
                 }
             }
         }

     }
}