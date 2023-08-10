package com.example.landmarkbook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landmarkList=ArrayList<Landmark>()
        val pisa=Landmark("Pisa Tower","Italy",R.drawable.pisa)
        val colesseum=Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel=Landmark("Eiffel","France",R.drawable.eyfel)
        val london=Landmark("London Bridge","England",(R.drawable.london))

        landmarkList.add(pisa)
        landmarkList.add(colesseum)
        landmarkList.add(eiffel)
        landmarkList.add(london)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter

    }
}