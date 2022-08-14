package com.example.travelbud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.travelbud.databinding.ActivityPlantripBinding

class plantrip : AppCompatActivity() {

    private lateinit var planbinding: ActivityPlantripBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        planbinding = ActivityPlantripBinding.inflate(layoutInflater)
        setContentView(planbinding.root)

        planbinding.planbtn.setOnClickListener {
            val intent = Intent(this@plantrip, planned::class.java)
            startActivity(intent)
        }


    }
}