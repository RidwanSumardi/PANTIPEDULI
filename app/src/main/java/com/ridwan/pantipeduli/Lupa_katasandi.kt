package com.ridwan.pantipeduli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ridwan.pantipeduli.databinding.ActivityLupaKatasandiBinding

class Lupa_katasandi : AppCompatActivity() {
    private lateinit var binding: ActivityLupaKatasandiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLupaKatasandiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}