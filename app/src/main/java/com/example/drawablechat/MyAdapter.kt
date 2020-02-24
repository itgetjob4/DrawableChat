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

    override fun onCreateLeftViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_me,parent,false))
    }

    override fun onCreateRightViewHolder(inflater: LayoutInflater, parent: ViewGroup): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.item_you,parent,false))

    }


    override fun getDecorationViewType(position: Int): ViewType {   // return the type of layout you want left or right
        return list[position].viewType
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.text.text=list.get(position).message

    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), DecViewHolder {  // one can also create seperate viewholders for different views

        var text: TextView

        init {
            text=itemView.findViewById(R.id.text)
        }

        override val decView: View
            get() =  text
    }


}