package com.ridwan.pantipeduli

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.google.firebase.auth.FirebaseAuth
import com.ridwan.pantipeduli.databinding.ActivityFaqBinding
import com.ridwan.pantipeduli.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
       binding.btnLogin.setOnClickListener {
           val email = binding.edtEmail.text.toString()
           val sandi = binding.edSandi.text.toString()

           if (!email.isNotEmpty()){
               binding.edtEmail.error = "Email Harus Diisi"
               binding.edtEmail.requestFocus()
               return@setOnClickListener
           }
           if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
               binding.edtEmail.error = "Email Harus Diisi"
               binding.edtEmail.requestFocus()
               return@setOnClickListener
           }
           if (!sandi.isNotEmpty()){
               binding.edSandi.error = "Sandi Harus Diisi"
               binding.edSandi.requestFocus()
               return@setOnClickListener
           }
//            validasi karakter
           if (sandi.length < 6){
               binding.edSandi.error = "Sandi Harus 6 Karakter"
               binding.edSandi.requestFocus()
               return@setOnClickListener
           }
           Daftarfirbase(email,sandi)
       }

        binding.daftar.setOnClickListener {
            val d = Intent(this@Login,Daftardonatur::class.java)
            startActivity(d)
        }


    }

    private fun Daftarfirbase(email: String, sandi: String) {
        auth.signInWithEmailAndPassword(email,sandi)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this,"Login Berhasil $email",Toast.LENGTH_SHORT).show()
                    val intent =Intent(this,Home::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"${it.exception?.message}",Toast.LENGTH_SHORT).show()
                }
            }

    }


}