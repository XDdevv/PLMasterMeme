package zed.rainxch.plmastermeme.master_meme.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zed.rainxch.plmastermeme.master_meme.domain.models.Template

@Composable
fun TemplateItem(
    template: Template,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(template.resId),
        contentDescription = "Image",
        modifier = modifier
            .size(176.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp)),
        contentScale = ContentScale.Crop
    )
}