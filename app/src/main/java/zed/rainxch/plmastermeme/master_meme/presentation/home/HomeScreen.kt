package zed.rainxch.plmastermeme.master_meme.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import zed.rainxch.plmastermeme.R
import zed.rainxch.plmastermeme.core.presentation.components.BoxWithTopbar
import zed.rainxch.plmastermeme.master_meme.presentation.home.components.TemplatesBottomSheet
import zed.rainxch.plmastermeme.master_meme.presentation.home.vm.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    val viewModel: HomeViewModel = hiltViewModel()
    BoxWithTopbar(
        title = "Memes",
        modifier = modifier.fillMaxSize()
    ) {
        var showBottomSheet by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_no_meme),
                contentDescription = stringResource(R.string.no_meme),
                modifier = Modifier
                    .width(140.dp)
                    .height(192.dp)
            )
            Spacer(Modifier.height(32.dp))
            Text(
                text = stringResource(R.string.tap_button_to_create_your_first_meme),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 12.sp
            )
        }

        FloatingActionButton(
            onClick = {
                showBottomSheet = true
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
            containerColor = MaterialTheme.colorScheme.primary
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = stringResource(R.string.add_icon)
            )
        }

        if (showBottomSheet) {
            TemplatesBottomSheet(
                onDismiss = {
                    showBottomSheet = false
                },
                onTemplateSelected = {

                },
                templateList = viewModel.getTemplateList()
            )
        }
    }
}