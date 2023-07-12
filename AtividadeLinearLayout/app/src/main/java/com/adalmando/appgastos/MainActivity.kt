package com.adalmando.appgastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.adalmando.appgastos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View){
        if(view.id == R.id.button_calculate){
            calculate()
        }
    }
    private fun calculate(){
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()
        val total = (distance*price)/autonomy
        // Toast notification:
        //Toast.makeText(this, "O total gasto é: R$ ${"%.2f".format(total)}", Toast.LENGTH_SHORT).show()
         binding.textTotalValue.text = "R$ ${"%.2f".format(total)}"
    }
}