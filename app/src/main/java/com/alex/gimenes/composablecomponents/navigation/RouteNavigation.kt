package com.alex.gimenes.composablecomponents.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class RouteNavigation(
    var route: String,
) {
    @Serializable
    data object Home : RouteNavigation(HOME)
}

const val HOME = "Home"