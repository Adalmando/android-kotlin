package com.adalmando.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adalmando.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Serve somente para esconder a barra que aparece no app com o nome do app:
        supportActionBar?.hide()

        // Eventos, basicamente estou dizendo para o kotlin observar se acontece um evento com o button:
        // o this fala que quem implementa o on Click listener é essa classe 'this'!
        binding.newPhrase.setOnClickListener(this)
    }

    // tenho que implementar a interface do View.OnClickListener na minha classe
    // e aqui tenho que sobrescrever o metodo, passando como parametro uma view:
    override fun onClick(view: View) {
        if (view.id == R.id.new_phrase){
            var s = ""
        }
    }


}