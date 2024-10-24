package ru.madcoders.delivery.screen_one.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.madcoders.delivery.design_system.components.SharedCard

@Composable
internal fun ScreenOneContent(
    onCardClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        SharedCard(
            modifier = Modifier.fillMaxWidth(0.5f),
            text = "Navigate to screen Two",
            backgroundColor = Color.Blue,
            onCardClick = {
                onCardClick()
            }
        )
    }
}
