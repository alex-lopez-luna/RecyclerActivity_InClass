package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(number: List<String>, color: List<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* TODO Step 3a: Provide Adapter Parent */ {

    private val numbers = number
    private val colors = color


    class NumberViewHolder(_textView: TextView) : RecyclerView.ViewHolder(_textView) {
        val textView = _textView
    }

    // TODO Step 3b: Complete function definitions for adapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context).apply {
                layoutParams = ViewGroup.LayoutParams(300, 300)
            }
        )

    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position]
        holder.textView.setTextColor(colors[position])

    }
}