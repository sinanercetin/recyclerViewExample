package com.sinanercetin.recyclerviewornegi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_layout.view.*

class VitaminRecyclerAdapter (val vitaminList: ArrayList<String>, val vitaminImageList: ArrayList<String>) : RecyclerView.Adapter<VitaminRecyclerAdapter.VitaminViewHolder>(){

    class VitaminViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VitaminViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_layout, parent,false)
        return VitaminViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VitaminViewHolder, position: Int) {

        println(vitaminImageList.get(position))

        holder.itemView.vitaminNameRV.text = vitaminList.get(position)
        holder.itemView.vitaminImageRV.downloadImage(vitaminImageList.get(position), makePlaceholder(holder.itemView.context))
        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(vitaminList.get(position), vitaminImageList.get(position))
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return vitaminList.size
    }


}