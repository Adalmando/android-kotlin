package com.adalmando.affirmations.data

import com.adalmando.affirmations.R
import com.adalmando.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations() :List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.imagem),
            Affirmation(R.string.affirmation2, R.drawable.imagem),
            Affirmation(R.string.affirmation3, R.drawable.imagem),
            Affirmation(R.string.affirmation4, R.drawable.imagem),
            Affirmation(R.string.affirmation5, R.drawable.imagem),
            Affirmation(R.string.affirmation6, R.drawable.imagem),
            Affirmation(R.string.affirmation7, R.drawable.imagem),
            Affirmation(R.string.affirmation8, R.drawable.imagem),
            Affirmation(R.string.affirmation9, R.drawable.imagem),
            Affirmation(R.string.affirmation10, R.drawable.imagem),
            Affirmation(R.string.affirmation11, R.drawable.imagem),
            Affirmation(R.string.affirmation12, R.drawable.imagem),
            Affirmation(R.string.affirmation13, R.drawable.imagem),
            Affirmation(R.string.affirmation14, R.drawable.imagem),
            Affirmation(R.string.affirmation15, R.drawable.imagem),
            Affirmation(R.string.affirmation16, R.drawable.imagem)
        )
    }
}