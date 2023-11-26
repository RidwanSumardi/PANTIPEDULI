package com.ridwan.pantipeduli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.ridwan.pantipeduli.databinding.ActivityHomeBinding
import kotlin.math.abs

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragmet(home_Fragment())


        binding.navButon.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragmet(home_Fragment())
                R.id.donasi -> replaceFragmet(donasi_Fragment())
                R.id.notif -> replaceFragmet(notif_Fragment())
                R.id.akun -> replaceFragmet(akun_Fragment())

                else -> {

                }

            }
            true

        }



    }


    private fun replaceFragmet(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }



}