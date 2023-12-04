package com.ridwan.pantipeduli

import android.content.Intent
import android.media.session.MediaSession.Token
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ridwan.pantipeduli.databinding.ActivityWelcomBinding

class Welcom : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityWelcomBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnMulai.setOnClickListener {
            val x = Intent(this@Welcom,Loginandsignup::class.java)
            startActivity(x)
            finish()
        }
    }
}