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

import com.kaspersky.components.kautomator.component.common.views.UiView
import com.kaspersky.components.kautomator.screen.UiScreen

class NotificationScreen: UiScreen<NotificationScreen>() {
    override val packageName: String
        get() = "com.google.samples.apps.nowinandroid.demo.debug"


    val actions = Actions()

    val allowButton = UiView {
        withId(this@NotificationScreen.packageName, "permission_allow_button")
    }

    val denyButton = UiView {
        withId(this@NotificationScreen.packageName, "permission_deny_button")
    }

    inner class Actions : ScreenIntentions<Actions>() {
        fun clickAllowButton() {
            allowButton.click()
        }

        fun clickDenyButton() {
            denyButton.click()
        }
    }
}