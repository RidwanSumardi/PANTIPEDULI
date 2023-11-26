package com.ridwan.pantipeduli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ridwan.pantipeduli.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.appCompatButton.setOnClickListener {
            if (binding.edtEmail.text.toString().isNullOrEmpty()){
                binding.edtEmail.error = "Harap diisi bidik ini"
            }else if (binding.editText.text.toString().isNullOrEmpty()){
                binding.editText.error = "Harap diisi bidik ini"
            }else{
                if (binding.edtEmail.text.toString().equals("ridwan23@gmail.com")&& binding.editText.text.toString().equals("123")){
                    startActivity(Intent(this@Login,Home::class.java))
                    finish()
                }else{
                    Toast.makeText(this@Login,"Gagal Login",Toast.LENGTH_SHORT).show()
                }
            }
            binding.daftar.setOnClickListener{
                val x = Intent(this@Login,Daftardonatur::class.java)
                startActivity(x)
                finish()
            }
            
        }
    }

}