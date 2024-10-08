package edu.temple.simplerecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)


        //TODO Step 4: Provide a RecyclerView.Adapter
        val numbers = listOf("One", "Two", "Three", "Four", "Five")
        val colors = listOf(Color.YELLOW, Color.BLUE, Color.RED, Color.GREEN, Color.DKGRAY)

        //init the adapter
        val adapter = NumberDisplayAdapter(numbers, colors)

        recyclerView.adapter = adapter
    }
}