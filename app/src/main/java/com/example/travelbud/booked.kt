package com.example.travelbud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travelbud.databinding.ActivityBookedBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions

class booked : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityBookedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = com.example.travelbud.databinding.ActivityBookedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

        binding.book.setOnClickListener {
            val intent = Intent(this@booked, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {

        val polyline1 = googleMap.addPolyline(
            PolylineOptions()
                .clickable(false)
                .add(
                    LatLng(27.6930434, 85.2820015),
                    LatLng(27.6857636, 85.2481842),
                    LatLng(27.6998615, 85.2079010),
                    LatLng(27.7134164, 85.2002335),
                    LatLng(27.7099776, 85.1921082),
                    LatLng(27.7170643, 85.1708221),
                    LatLng(27.7162113, 85.1522827),
                    LatLng(27.7361780, 85.1306534),
                    LatLng(27.7465417, 85.0896835),
                    LatLng(27.7501473, 85.0479126),
                    LatLng(27.7643735, 85.0436783),
                    LatLng(27.7980139, 85.0001907),
                    LatLng(27.8016302, 84.9736404),
                    LatLng(27.8156244, 84.9564743),
                    LatLng(27.7978189, 84.9232864),
                    LatLng(27.8069244, 84.8872375),
                    LatLng(27.8013269, 84.8672104),
                    LatLng(27.8072279, 84.8525619),
                    LatLng(27.8004172, 84.8415756),
                    LatLng(27.8124542, 84.8310471),
                    LatLng(27.8070972, 84.8186874),
                    LatLng(27.8148856, 84.8094177),
                    LatLng(27.8104652, 84.7812652),
                    LatLng(27.8066915, 84.7713089),
                    LatLng(27.8132621, 84.7616959),
                    LatLng(27.7952864, 84.7332001),
                    LatLng(27.8179479, 84.6669388),
                    LatLng(27.8463563, 84.6613312),
                    LatLng(27.8548552, 84.6508026),
                    LatLng(27.8694187, 84.6286011),
                    LatLng(27.8795221, 84.5906067),
                    LatLng(27.8556642, 84.5606232),
                    LatLng(27.8700348, 84.5462036),
                    LatLng(27.9118853, 84.5274353),
                    LatLng(27.9112827, 84.5054626),
                    LatLng(27.9240227, 84.4974518),
                    LatLng(27.9450429, 84.4521332),
                    LatLng(27.9521227, 84.4161987),
                    LatLng(27.9777814, 84.3912506),
                    LatLng(27.9767745, 84.3617249),
                    LatLng(27.9876828, 84.3468475),
                    LatLng(27.9871409, 84.2772674),
                    LatLng(27.9770896, 84.2690277),
                    LatLng(27.9817327, 84.2429352),
                    LatLng(27.9817341, 84.1955567),
                    LatLng(28.0087998, 84.1337585),
                    LatLng(28.0116349, 84.1193390),
                    LatLng(28.0249104, 84.1101837),
                    LatLng(28.0239543, 84.0875244),
                    LatLng(28.0651435, 84.0694427),
                    LatLng(28.1156064, 84.0934754),
                    LatLng(28.1668551, 84.0557098),
                    LatLng(28.1920744, 84.0277863),
                    LatLng(28.2095297, 83.9855862)
                )
        )

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(27.6930434, 85.2820015), 8f))

    }
}