package com.poonia.youtubeui.Home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poonia.youtubeui.R


@Composable
fun Video(vsoucrce:VidoInfoData) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    Column {
        Image(painter = painterResource(id = vsoucrce.thumbnail), contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(screenHeight * 0.25f)
        )
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 12.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = vsoucrce.profilePic), contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(6.dp))

                Column {
                    Text(text = vsoucrce.title)
                    Text(
                        text = "${vsoucrce.channelName} - ${vsoucrce.views} views - ${vsoucrce.posted}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
            Icon(
                imageVector = Icons.Rounded.MoreVert,
                  contentDescription = null
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun VideoPreview(){
    Video(vsoucrce = VidoInfoData(thumbnail= R.drawable.birds,"title bbbbbbbbbb", R.drawable.birds,"Birds", "1111M", "1day ago"))

}