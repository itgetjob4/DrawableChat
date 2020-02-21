package com.example.effectlib

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

abstract class DecorationAdapter<VH : RecyclerView.ViewHolder>  : RecyclerView.Adapter<VH>()  {


    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater= LayoutInflater.from(parent.context)
        if (viewType == ViewType.LEFT.int) {
             return onCreateLeftViewHolder(inflater,parent)
        } else {
            return onCreateRightViewHolder(inflater,parent)
        }
    }



    final override fun getItemViewType(position: Int): Int {
        return getDecorationViewType(position).int
    }

    abstract fun getDecorationViewType(position: Int): ViewType

    abstract fun onCreateLeftViewHolder(inflater:LayoutInflater,parent: ViewGroup):VH

    abstract fun onCreateRightViewHolder(inflater:LayoutInflater,parent: ViewGroup):VH

    //    override fun getItemViewType(position: Int): Int {
//        return users[position].itemViewType
//    }

}