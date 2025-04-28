package zed.rainxch.plmastermeme.core.domain.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavGraph(var route: String, var title: String, var isPopBackable: Boolean) {
    @Serializable
    object HomeScreen : NavGraph(route = "home", title = "Home", isPopBackable = false)

    @Serializable
    object EditorScreen : NavGraph(route = "editor", title = "New meme", isPopBackable = false)

}