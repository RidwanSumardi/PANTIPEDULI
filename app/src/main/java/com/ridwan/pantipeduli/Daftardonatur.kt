package com.ridwan.pantipeduli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ridwan.pantipeduli.databinding.ActivityDaftardonaturBinding

class Daftardonatur : AppCompatActivity() {
    private lateinit var binding: ActivityDaftardonaturBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDaftardonaturBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnMasuk.setOnClickListener {
            val x = Intent(this@Daftardonatur,Daftar_Berasil::class.java)
            startActivity(x)
            finish()
        }
    }
}