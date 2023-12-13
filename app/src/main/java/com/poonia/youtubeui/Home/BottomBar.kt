package com.poonia.youtubeui.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Subscriptions
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poonia.youtubeui.R

@Preview
@Composable
fun BottomBar() {
    BottomAppBar({
        NavigationBar {
            BottomNavigationItem(
                selected = true,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                },
                label = {
                    Text(
                        text = "Home",
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            )
            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.shorts),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                },
                label = {
                    Text(
                        text = "Shorts",
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            )

            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Box(
                        modifier = Modifier
                            .border(
                                color = Color.White,
                                width = 1.dp,
                                shape = CircleShape
                            )
                            .padding(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Add,
                            contentDescription = null,
                            modifier = Modifier.size(38.dp)
                        )
                    }
                }
            )
            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Subscriptions,
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                },
                label = {
                    Text(
                        text = "Subscriptions",
                        style = MaterialTheme.typography.labelMedium,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
                    )
                }
            )

            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.glogo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                            .clip(CircleShape)
                    )
                },
                label = {
                    Text(
                        text = "You",
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            )
        }
    }
    )
}