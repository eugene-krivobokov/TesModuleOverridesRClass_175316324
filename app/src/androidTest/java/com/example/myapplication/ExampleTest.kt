package com.example.myapplication

import android.util.Log
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.feature.PageObject
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleTest {

    @get: Rule
    val screenRule = ScreenRule()

    @Test
    fun open_screen() {
        logIds()

        screenRule.start()

        Espresso.onView(withId(PageObject().idFromFeature))
            .check(matches(isDisplayed()))
    }

    private fun logIds() {
        Log.i(
            "===",
            "In test: com.example.feature.R.layout.activity_main: " + Integer.toHexString(com.example.feature.R.layout.activity_main)
        )
    }
}