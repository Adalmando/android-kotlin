package com.adalmando.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.adalmando.motivation.infra.MotivationConstants
import com.adalmando.motivation.R
import com.adalmando.motivation.infra.Security
import com.adalmando.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categortyId = MotivationConstants.FILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconder barre de navegação
        supportActionBar?.hide()

        // recuperando o nome do usuario que foi salvo:
        handleUserName()

        // Eventos
        binding.newPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageEmoji.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
    }

    // tenho que implementar a interface do View.OnClickListener na minha classe
    // e aqui tenho que sobrescrever o metodo, passando como parametro uma view:
    override fun onClick(view: View) {
        if (view.id == R.id.new_phrase){
            var s = ""
        }else if(view.id in listOf(R.id.image_all, R.id.image_emoji, R.id.image_sunny)){
            handleFilter(view.id)
        }

    }

    private fun handleUserName(){
        val name = Security(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textOne.text = "Olá, $name!"
    }

    private fun handleFilter(id: Int){
        binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.button_user))
        binding.imageEmoji.setColorFilter(ContextCompat.getColor(this, R.color.button_user))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.button_user))

        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categortyId = MotivationConstants.FILTER.ALL
            }
            R.id.image_emoji -> {
                binding.imageEmoji.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categortyId = MotivationConstants.FILTER.EMOJI
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categortyId = MotivationConstants.FILTER.SUNNY
            }
        }
    }
}