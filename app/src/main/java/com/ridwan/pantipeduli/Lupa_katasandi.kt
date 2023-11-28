package com.ridwan.pantipeduli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.ridwan.pantipeduli.databinding.ActivityLupaKatasandiBinding
import java.util.regex.Pattern

class Lupa_katasandi : AppCompatActivity() {
    private lateinit var binding: ActivityLupaKatasandiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLupaKatasandiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLupasandi.setOnClickListener {
            val email = binding.edLupa.text.toString()
            val edemail = binding.edLupa

            if (email.isEmpty()){
                edemail.error = "email tidak boleh kosong"
                edemail.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                edemail.error = "email tidak boleh valid"
                edemail.requestFocus()
                return@setOnClickListener
            }
        }
    }
}