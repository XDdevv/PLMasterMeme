package zed.rainxch.plmastermeme.core.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import zed.rainxch.plmastermeme.core.domain.navigation.NavGraph
import zed.rainxch.plmastermeme.master_meme.presentation.home.HomeScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavGraph.HomeScreen,
        modifier = modifier.fillMaxSize()
    ) {
        composable<NavGraph.HomeScreen> {
            HomeScreen()
        }

        composable<NavGraph.EditorScreen> {

        }

    }
}