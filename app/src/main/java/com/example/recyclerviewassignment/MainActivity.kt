package com.example.recyclerviewassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity :AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<Recycler_view_Adapter.ViewHolder>? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        val rv = findViewById<RecyclerView>(R.id.recycler_view_on_main_activity)
        rv.layoutManager = layoutManager

        adapter = Recycler_view_Adapter()
        rv.adapter = adapter

    }

}