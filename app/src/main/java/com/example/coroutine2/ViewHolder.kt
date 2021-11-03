package com.example.coroutine2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.view.*

import kotlinx.android.synthetic.main.item_layout.view.*

class ViewHolder (view:View):RecyclerView.ViewHolder(view) {
    fun setData(responseCat: ResponseCat){
        itemView.apply {
            Glide.with(imageView3).load(responseCat.url).into(imageView3)

        }

    }
}