package com.sinanercetin.recyclerviewornegi

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.downloadImage(url : String?, placeholder: CircularProgressDrawable){

    val opt = RequestOptions().placeholder(placeholder).error(R.mipmap.ic_launcher)
    Glide.with(context).setDefaultRequestOptions(opt).load(url).into(this)
}


fun makePlaceholder (context: Context): CircularProgressDrawable {

    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}