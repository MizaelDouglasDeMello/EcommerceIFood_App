package br.com.mizaeldouglas.ecommerceifoods_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.mizaeldouglas.ecommerceifoods_app.databinding.ActivityCadastroBinding
import br.com.mizaeldouglas.ecommerceifoods_app.databinding.ActivityMainBinding

class CadastroActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityCadastroBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        inicializar()
    }

    private fun inicializar() {
        TODO("Not yet implemented")
    }
}