package com.ridwan.pantipeduli

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ridwan.pantipeduli.databinding.ActivityLoginandsignupBinding

class Loginandsignup : AppCompatActivity() {
    private lateinit var binding: ActivityLoginandsignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginandsignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val btndaftar = findViewById<Button>(R.id.btn_daftar)
        btndaftar.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.daftaruser,null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            val btndonatur = dialogBinding.findViewById<Button>(R.id.btn_donatur)
            btndonatur.setOnClickListener {
                val s = Intent(this@Loginandsignup,Daftardonatur::class.java)
                startActivity(s)
                finish()
            }

        }

        binding.imkiri1.setOnClickListener {
            val i = Intent(this@Loginandsignup,Welcom::class.java)
            startActivity(i)
            finish()
        }
        binding.btnMasuk.setOnClickListener {
            val i = Intent(this@Loginandsignup,Login::class.java)
            startActivity(i)
            finish()
        }

    }
}