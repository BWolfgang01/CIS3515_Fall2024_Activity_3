package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings.TextSize
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.core.view.get

// TODO Replace ArrayAdapter with your implementation of TextSizeAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        val numberArray = Array(50){i -> (i + 1) * 2}

        spinner.adapter = TextSizeAdapter(this, numberArray)

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long){
                displayTextView.setTextSize(parent!!.getItemAtPosition(position).toString().toFloat())
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        }
    }
