/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework15.screen

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.ui.homeworks.homework15.tags.SearchScreenTestTags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class SearchScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<SearchScreen>(semanticsProvider = semanticsProvider) {

    val actions = Actions()
    val checks = Checks()

    val searchTextField = child<KNode> {
        hasTestTag(SearchScreenTestTags.SEARCH_TEXT_FIELD)
    }

    val searchIcon = child<KNode> {
        hasTestTag(SearchScreenTestTags.SEARCH_ICON)
    }

    val clearButton = child<KNode> {
        hasTestTag(SearchScreenTestTags.CLEAR_BUTTON)
    }

    val backButton = child<KNode> {
        hasTestTag(SearchScreenTestTags.BACK_BUTTON)
    }

    inner class Checks : ScreenIntentions<Checks>() {

        fun checkTextField() {
            searchTextField.assertIsDisplayed()
        }

        fun checkSearchIcon() {
            searchIcon.assertIsDisplayed()
        }

        fun checkClearButton() {
            clearButton.assertIsDisplayed()
        }

        fun checkBackButton() {
            backButton.assertIsDisplayed()
        }

    }

    inner class Actions : ScreenIntentions<Actions>() {

        fun clickSearchTextField() {
            searchTextField.performClick()
        }

        fun clickClearButton() {
            clearButton.performClick()
        }

        fun enterTextSearch(text: String) {
            searchTextField.performTextInput(text)
        }
    }
}