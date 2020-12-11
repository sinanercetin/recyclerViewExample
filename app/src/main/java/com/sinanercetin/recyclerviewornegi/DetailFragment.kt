package com.sinanercetin.recyclerviewornegi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private lateinit var vitName: String
    private lateinit var vitImage: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            vitName = DetailFragmentArgs.fromBundle(it).vitName
            vitImage = DetailFragmentArgs.fromBundle(it).vitImage
        }

        nameVitamin.text = vitName
        context?.let {
            imageVitamin.downloadImage(vitImage, makePlaceholder(it))
        }

    }

}