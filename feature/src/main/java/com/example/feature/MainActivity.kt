package com.example.feature

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(
            "===", "In activity: com.example.feature.R.layout.activity_main: "
                    + Integer.toHexString(com.example.feature.R.layout.activity_main)
        )
        setContentView(R.layout.activity_main)

        requireNotNull(findViewById(R.id.text))
    }
}