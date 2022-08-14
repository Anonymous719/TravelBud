package com.example.travelbud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.travelbud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainnavview.background=null
        binding.mainnavview.menu.getItem(2).isEnabled=false

        replacefragment(Homefragment())

        binding.plantripbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, plantrip::class.java)
            startActivity(intent)
        }

        binding.mainnavview.setOnItemSelectedListener{
            when(it.itemId) {
                R.id.homebtn -> replacefragment(Homefragment())
                R.id.friendbtn -> replacefragment(Friendfragment())
                R.id.profilebtn -> replacefragment(Profilefragment())
                R.id.searchbtn -> replacefragment(Searchfragment())

            }
            true
        }
    }

    private fun replacefragment(fragment : Fragment){

        val fragmentManager=supportFragmentManager
        val fragmentTransection=fragmentManager.beginTransaction()
        fragmentTransection.replace(R.id.fragmentcontainer,fragment)

        fragmentTransection.commit()

    }

}