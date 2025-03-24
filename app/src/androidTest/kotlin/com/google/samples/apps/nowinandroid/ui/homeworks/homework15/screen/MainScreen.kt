package com.google.samples.apps.nowinandroid.ui.homeworks.homework15.screen

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.ui.homeworks.homework15.tags.MainScreenTestTags
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class MainScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<MainScreen>(semanticsProvider = semanticsProvider) {

    val actions = Actions()
    val checks = Checks()

    val titleText = child<KNode> {
        hasTestTag(MainScreenTestTags.TITLE_TEXT)
    }

    val navigationButton = child<KNode> {
        hasTestTag(MainScreenTestTags.NAVIGATION_BUTTON)
    }

    val actionsButton = child<KNode> {
        hasTestTag(MainScreenTestTags.ACTIONS)
    }

    // Действия на странице через внутренний класс
    inner class Actions : ScreenIntentions<Actions>() {
        fun clickNavigationButton() {
            navigationButton.performClick()
        }

        fun clickActionsButton() {
            actionsButton.performClick()
        }
    }

    // Проверки на странице через внутренний класс
    inner class Checks : ScreenIntentions<Checks>() {
        fun checkScreenTitle(text: String) {
            titleText.assertTextEquals(text)
        }

        fun checkNavigationButton() {
            navigationButton.assertIsDisplayed()
        }
    }
}
