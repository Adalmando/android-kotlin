package com.adalmando.motivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adalmando.motivation.databinding.ActivityMainBinding
import com.adalmando.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.login.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.login) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = binding.segundo.text.toString()
        if (name != "" && name != null) {
            startActivity(Intent(this, MainActivity::class.java))
            bindingMain.textOne.text = "Olá, $name!"
        } else {
            Toast.makeText(this, R.string.validation_mandatory_name,
                Toast.LENGTH_SHORT).show()
        }
    }
}