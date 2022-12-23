package com.example.applicationouahlinekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var my_array = arrayOf("omaima ouahline", "étudiant 1", "étudiant 2", "étudiant 3", "étudiant 4", "étudiant 5")
        var my_adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, my_array)
        var my_list = findViewById<ListView>(R.id.my_list)
        my_list.adapter = my_adapter
    }
}