@file:OptIn(ExperimentalMaterial3Api::class)

package com.poonia.youtubeui

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Subscriptions
import androidx.compose.material.icons.outlined.VideoLibrary
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poonia.youtubeui.Home.BottomBar
import com.poonia.youtubeui.Home.Categories
import com.poonia.youtubeui.Home.TopBar
import com.poonia.youtubeui.Home.Video
import com.poonia.youtubeui.Home.VideoInfoList
import com.poonia.youtubeui.Home.VidoInfoData
import com.poonia.youtubeui.ui.theme.YoutubeUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YoutubeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  youHomeScreen(videodata = VideoInfoList.videoInfoList)
                    youHomeScreenPreview()
                }
            }
        }
    }

     @Preview(showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    private fun youHomeScreenPreview() {
        youHomeScreen(videodata = VideoInfoList.videoInfoList)
    }
}

@Composable
fun youHomeScreen(videodata:List<VidoInfoData>) {
    Scaffold(
        topBar = {
            Column {
                TopBar()
                Categories()
            }
        },
        bottomBar = {
            BottomBar()
        }
    ) { padding ->
        LazyColumn(
            contentPadding = PaddingValues(
                top = padding.calculateTopPadding() + 10.dp,
                bottom = padding.calculateBottomPadding()
            ),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            items(videodata) { vdata ->
                Video(vdata)
            }
        }
    }
}
