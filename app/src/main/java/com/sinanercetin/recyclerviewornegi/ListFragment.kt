package com.sinanercetin.recyclerviewornegi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // List of Datas

        val vitaminList = ArrayList<String>()
        vitaminList.add("A Vitamini")
        vitaminList.add("C Vitamini")
        vitaminList.add("B1 Vitamini")
        vitaminList.add("B2 Vitamini")
        vitaminList.add("Niasin Eşdeğerliği")
        vitaminList.add("B6 Vitamini")
        vitaminList.add("B12 Vitamini")


        val vitaminImageList = ArrayList<String>()
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")
        vitaminImageList.add("https://pixabay.com/get/55e4d64a4b5aa514f1dc8460da29317e1239d9e75a5270_640.jpg")

        //Adapter
        val layoutManager = LinearLayoutManager(context)
        vitaminRecyclerView.layoutManager = layoutManager

        val adapter = VitaminRecyclerAdapter(vitaminList, vitaminImageList)
        vitaminRecyclerView.adapter = adapter

    }


}