package com.sinanercetin.recyclerviewornegi

import android.os.Bundle
import android.util.Base64
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.rv_layout.view.*

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

        val listView : ListView = listview
        var arrayAdapter : ArrayAdapter<String>

        if(vitName == "A Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.a_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "C Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.c_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.c_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "B1 Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.b1_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "B2 Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.b2_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "Niasin Eşdeğerliği"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.niasin_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "B6 Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.b6_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }
        if(vitName == "B12 Vitamini"){
            //val array: Array = resources.getStringArray(R.array.planets_array)
            altBaslikVitamin.text = resources.getString(R.string.b12_vitamin_altbaslik)
            val fruits : Array<String> = resources.getStringArray(R.array.a_vitamin)
            context?.let {
                arrayAdapter = ArrayAdapter(it, R.layout.support_simple_spinner_dropdown_item, fruits)
                listView.adapter = arrayAdapter
            }
        }


    }

}