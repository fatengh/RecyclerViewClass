package com.example.recyclerviewclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var names: ArrayList<String>
    private lateinit var rv : RecyclerView
    private lateinit var btn: Button
    private lateinit var ed :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv= findViewById(R.id.rvNames)
        ed = findViewById(R.id.ed)
        btn = findViewById(R.id.btn)
        names = ArrayList()
        names.add("faten")
        names.add("khaled")
        names.add("meme")
        names.add("fadia")
        names.add("rawya")
        names.add("ruba")
        rv.adapter = NewAdap(names)
        rv.layoutManager = LinearLayoutManager(this)


        btn.setOnClickListener {
            val name = ed.text.toString()
            names.add(name)
            ed.text.clear()
            ed.clearFocus()

            rv.adapter?.notifyDataSetChanged()


        }

    }
}