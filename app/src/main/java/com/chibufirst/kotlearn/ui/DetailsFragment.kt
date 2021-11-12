package com.chibufirst.kotlearn.ui

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.chibufirst.kotlearn.R
import com.chibufirst.kotlearn.databinding.FragmentDetailsBinding
import com.chibufirst.kotlearn.util.KotlinLessonData

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.topicText.text = args.lesson.topic
        binding.topicContent.text = Html.fromHtml(args.lesson.content, Html.FROM_HTML_MODE_COMPACT)
        if (args.lesson.image != 0) {
            binding.lessonImage.setImageResource(args.lesson.image)
        }
        binding.backImage.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_homeFragment)
        }
        binding.shareImage.setOnClickListener { shareLesson() }
    }

    private fun shareLesson() {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, args.lesson.topic + "\n\n" + args.lesson.content) //Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY).toString()
        requireActivity().startActivity(Intent.createChooser(shareIntent, "KotLearn Share"))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}