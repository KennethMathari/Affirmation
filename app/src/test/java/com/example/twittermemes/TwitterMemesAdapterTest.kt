package com.example.twittermemes

import android.content.Context
import com.example.twittermemes.adapter.ItemAdapter
import com.example.twittermemes.model.TwitterMemes
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class TwitterMemesAdapterTest {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            TwitterMemes(R.string.affirmation1, R.drawable.image1),
            TwitterMemes(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}