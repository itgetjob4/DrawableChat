package com.example.drawablechat

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.effectlib.DecViewHolder
import com.example.effectlib.DecorationAdapter
import com.example.effectlib.ViewType


class MyAdapter(var list:ArrayList<MyModel>) : DecorationAdapter<MyAdapter.ViewHolder>() {


    override fun getDecorationViewType(position: Int): ViewType {
        return list[position].viewType
    }

    override fun onCreateLeftViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_me,parent,false))
    }

    override fun onCreateRightViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_you,parent,false))

    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {

            holder.text.text=list.get(position).message

    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), DecViewHolder {

        var text: TextView

        init {
            text=itemView.findViewById(R.id.text)
        }

        override val decView: View
            get() =  text
    }


}