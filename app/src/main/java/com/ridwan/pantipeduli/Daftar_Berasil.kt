package com.ridwan.pantipeduli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ridwan.pantipeduli.databinding.ActivityDaftarBerasilBinding

class Daftar_Berasil : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarBerasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDaftarBerasilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnBerhasil.setOnClickListener {
            val x = Intent(this@Daftar_Berasil,Home::class.java)
            startActivity(x)
            finish()
        }
    }
}