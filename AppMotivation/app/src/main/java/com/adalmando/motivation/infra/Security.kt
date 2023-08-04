package com.adalmando.motivation.infra

import android.content.Context
import android.content.SharedPreferences

class Security (context: Context){

    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    // função que cria um map com chave e valor na memoria do app:
    fun storeString(key: String, value: String){
        security.edit().putString(key, value).apply()
    }

    // retorna o valor que tiver associado a chave que eu passar, caso não exista retorna o defValue:
    fun getString(key: String): String{
       return security.getString(key, "") ?: "" // operador elvis, retorna "" se o valor for null:
    }
}