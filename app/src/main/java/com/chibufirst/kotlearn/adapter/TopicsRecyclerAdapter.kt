package com.chibufirst.kotlearn.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chibufirst.kotlearn.R
import com.chibufirst.kotlearn.models.Lessons
import com.chibufirst.kotlearn.ui.HomeFragmentDirections

class TopicsRecyclerAdapter(private val lessonsList: List<Lessons>) :
    RecyclerView.Adapter<TopicsRecyclerAdapter.TopicsRecyclerViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TopicsRecyclerViewHolder {
        return TopicsRecyclerViewHolder(
            LayoutInflater.from(p0.context).inflate(R.layout.topics_list_item, p0, false)
        )
    }

    override fun onBindViewHolder(p0: TopicsRecyclerViewHolder, p1: Int) {
        p0.numberText.text = p1.plus(1).toString()
        p0.topicsText.text = lessonsList[p1].topic
        p0.itemView.setOnClickListener { view ->
            if (p1.plus(1) > 11) {
                Toast.makeText(
                    p0.itemView.context,
                    "Content for \"${lessonsList[p1].topic}\" coming soon.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val action =
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(lessonsList[p1])
                view.findNavController().navigate(action)
            }
        }
    }

    override fun getItemCount(): Int = lessonsList.size

    class TopicsRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberText: TextView = itemView.findViewById(R.id.number_text)
        val topicsText: TextView = itemView.findViewById(R.id.topics_text)
    }
}