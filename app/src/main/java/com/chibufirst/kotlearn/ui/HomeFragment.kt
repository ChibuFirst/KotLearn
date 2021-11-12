package com.chibufirst.kotlearn.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.chibufirst.kotlearn.adapter.TopicsRecyclerAdapter
import com.chibufirst.kotlearn.databinding.FragmentHomeBinding
import com.chibufirst.kotlearn.util.KotlinLessonData

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.topicsRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = TopicsRecyclerAdapter(KotlinLessonData.topicsList())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}