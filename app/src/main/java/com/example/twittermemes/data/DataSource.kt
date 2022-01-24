package com.example.twittermemes.data

import com.example.twittermemes.R
import com.example.twittermemes.model.TwitterMemes

class DataSource {

    fun loadTwitterMemes():List<TwitterMemes> {
        return listOf<TwitterMemes>(
            TwitterMemes(R.string.affirmation1,R.drawable.image1),
            TwitterMemes(R.string.affirmation2,R.drawable.image2),
            TwitterMemes(R.string.affirmation3,R.drawable.image3),
            TwitterMemes(R.string.affirmation4,R.drawable.image4),
            TwitterMemes(R.string.affirmation5,R.drawable.image5),
            TwitterMemes(R.string.affirmation6,R.drawable.image6),
            TwitterMemes(R.string.affirmation7,R.drawable.image7),
            TwitterMemes(R.string.affirmation8,R.drawable.image8),
            TwitterMemes(R.string.affirmation9,R.drawable.image9),
            TwitterMemes(R.string.affirmation10,R.drawable.image10)
        )
    }
}