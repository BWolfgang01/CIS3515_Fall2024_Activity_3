package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val _context: Context, private val _numberArray: Array<Int>) : BaseAdapter() {
    private val context = _context
    private val numberArray = _numberArray

    override fun getCount() = numberArray.size

    override fun getItem(position: Int) = numberArray[position]

    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null){
            textView = convertView as TextView
        }
        else{
            textView = TextView(context)
            textView.setPadding(5,10,0,10)
        }

        textView.setTextSize(getItem(position).toString().toFloat())
        textView.text = getItem(position).toString()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent)
    }
}