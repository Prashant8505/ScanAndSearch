package com.mindofdevices.scanandsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mindofdevices.scanandsearch.textRecognition.main.MainFragment


class TextRecognition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_recognition)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}