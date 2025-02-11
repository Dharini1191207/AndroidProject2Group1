package com.example.android.testing.espresso.BasicSample

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorKtTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun changeTextTestStringWithInput123() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.typeText("123"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(ViewActions.click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("123")))
    }

    @Test
    fun changeTextOpenNewActivityTestStringWithInput123() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.typeText("123"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.activityChangeTextBtn)).perform(ViewActions.click())
        onView(withId(R.id.show_text_view)).check(matches(withText("123")))
    }

    @Test
    fun changeTextTestStringWithEmptyInput() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.clearText())
        onView(withId(R.id.changeTextBt)).perform(ViewActions.click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("")))
    }

    @Test
    fun changeTextOpenNewActivityWithEmptyInput() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.clearText())
        onView(withId(R.id.activityChangeTextBtn)).perform(ViewActions.click())
        onView(withId(R.id.show_text_view)).check(matches(withText("")))
    }

    @Test
    fun changeTextTestStringWithInputAbcdef() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.typeText("abcdef"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(ViewActions.click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("abcdef")))
    }

    @Test
    fun changeTextOpenNewActivityTestStringWithInputAbcdef() {
        onView(withId(R.id.editTextUserInput)).perform(ViewActions.typeText("abcdef"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.activityChangeTextBtn)).perform(ViewActions.click())
        onView(withId(R.id.show_text_view)).check(matches(withText("abcdef")))
    }
}

