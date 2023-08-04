package com.adalmando.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adalmando.motivation.infra.MotivationConstants
import com.adalmando.motivation.R
import com.adalmando.motivation.infra.Security
import com.adalmando.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.login.setOnClickListener(this)

        verifyUserName()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.login) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = binding.segundo.text.toString()
        if (name != "") {
            // salvando o nome de usuario:
            Security(this).storeString(MotivationConstants.KEY.USER_NAME, name)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            Toast.makeText(this, R.string.validation_mandatory_name,
                Toast.LENGTH_SHORT).show()
        }
    }

    private fun verifyUserName(){
        val name = Security(this).getString(MotivationConstants.KEY.USER_NAME)
        if(name != ""){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}