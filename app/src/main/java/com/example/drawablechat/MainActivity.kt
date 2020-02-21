package com.example.drawablechat

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.effectlib.Config
import com.example.effectlib.GradientDrawable
import com.example.effectlib.MyDecoration
import com.example.effectlib.ViewType
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAdapter()


    }

    private fun myAdapter(){
        myRecycler.layoutManager=LinearLayoutManager(this)
        setDecorations()
        var adapter=MyAdapter(myListItems())
        myRecycler.adapter=adapter
    }

    private fun myListItems():ArrayList<MyModel>{
        var myList=ArrayList<MyModel>()
        for (i in 0..49) {
            if (i%3==0 || i%5==1 || i%7==0){

                myList.add(MyModel(UUID.randomUUID().toString(),ViewType.LEFT))
            }else{

                myList.add(MyModel(UUID.randomUUID().toString(),ViewType.RIGHT))
            }
        }

        return myList
    }


    fun setDecorations(){
        val r = resources
        val config = Config(
            ContextCompat.getDrawable(this@MainActivity,R.drawable.crop)!!,      //  ColorDrawable(r.getColor(R.color.message_me_background)),
            GradientDrawable(r.getIntArray(R.array.list_gradient_color))
        )



        myRecycler.addItemDecoration(MyDecoration(config, ViewType.LEFT,ViewType.RIGHT ,true))
    }


}
