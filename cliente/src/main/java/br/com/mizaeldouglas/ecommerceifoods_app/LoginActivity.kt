package br.com.mizaeldouglas.ecommerceifoods_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.mizaeldouglas.ecommerceifoods_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initializer()
    }

    private fun initializer() {

    }
}