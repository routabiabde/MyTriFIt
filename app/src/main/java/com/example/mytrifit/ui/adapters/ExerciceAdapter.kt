package com.example.mytrifit.ui.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mytrifit.R
import com.example.mytrifit.model.Exercice

import android.view.LayoutInflater
import android.widget.ImageView
import com.example.mytrifit.model.Muscle


class ExerciseAdapter(private var exerciseList: List<Exercice>,private val listener: ExerciseAdapter.OnItemClickListener1) :
    RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    fun setExerciceList(myList:List<Exercice>){
        this.exerciseList = myList
        notifyDataSetChanged()
    }
    interface OnItemClickListener1 {
        fun onItemClick(exercice: Exercice)
    }

   inner class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val exerciseName: TextView = itemView.findViewById(R.id.nomExercice)
        val sets: TextView = itemView.findViewById(R.id.sets)
        var reps:TextView = itemView.findViewById(R.id.rep)
        val rating:TextView = itemView.findViewById(R.id.rating)
        val exerIcon:ImageView = itemView.findViewById(R.id.imgExercice)
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                var exercice:Exercice =   exerciseList[position]
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(exercice)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewtest, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val currentExercise = exerciseList[position]

        holder.exerciseName.text = currentExercise.nameExer
        holder.sets.text = " : "+currentExercise.numSeri.toString()
        holder.rating.text = currentExercise.rating.toString()
        holder.reps.text = " : "+currentExercise.rep
        holder.exerIcon.setImageResource(currentExercise.logo)
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }


}
