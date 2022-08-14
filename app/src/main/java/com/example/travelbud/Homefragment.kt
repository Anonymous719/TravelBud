package com.example.travelbud

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelbud.databinding.ActivityMainBinding
import com.example.travelbud.databinding.ActivityMainBinding.inflate
import com.example.travelbud.databinding.FragmentHomefragmentBinding


class Homefragment : Fragment() {

    companion object {
        fun newInstance() = Homefragment()
    }

    private lateinit var suggestlist: ArrayList<nearbysuggest>
    private lateinit var nearbysuggestadapter: nearbysuggestadapter
    private var fragbinding : FragmentHomefragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragbinding = FragmentHomefragmentBinding.inflate(inflater, container, false)
        init()
        return fragbinding!!.root
    }

    private fun init() {
        var layoutManager = LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false)
        fragbinding!!.nearbysuggest.setHasFixedSize(true)
        fragbinding!!.nearbysuggest.setLayoutManager(layoutManager)

        suggestlist = ArrayList()

        addDataToList()

        nearbysuggestadapter = nearbysuggestadapter(suggestlist)
        fragbinding!!.nearbysuggest.setAdapter(nearbysuggestadapter)
    }

    private fun addDataToList() {
        suggestlist.add(
            nearbysuggest(
                R.drawable.ku,
                "Kathmandu University",
                "Time: 2min",
                "Walk"
            )
        )
        suggestlist.add(
            nearbysuggest(
                R.drawable.dharhara,
                "Dharahara",
                "Time: 2 hrs",
                "Sightseeing"
            )
        )
        suggestlist.add(
            nearbysuggest(
                R.drawable.patan,
                "Patan Durbar Square",
                "Time: 2 hrs",
                "Sightseeing"
            )
        )
        suggestlist.add(
            nearbysuggest(
                R.drawable.mahabharat,
                "Mahabharat Range",
                "Time: 2 hrs",
                "Trekking"
            )
        )
    }

}