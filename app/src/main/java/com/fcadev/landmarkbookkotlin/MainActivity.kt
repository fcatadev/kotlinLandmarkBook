package com.fcadev.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.fcadev.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //Data

        val pisa = Landmark("Pisa","Italy", R.drawable.pisa)
        val colosseum = Landmark("Colesseum", "Italy", R.drawable.colosseum)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        //Adapter : Layout & Data

        //Mapping

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

    }
}