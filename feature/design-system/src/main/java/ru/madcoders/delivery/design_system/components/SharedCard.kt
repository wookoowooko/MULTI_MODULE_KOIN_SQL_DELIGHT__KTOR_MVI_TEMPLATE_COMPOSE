package ru.madcoders.delivery.design_system.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.madcoders.delivery.design_system.helpers.SingleClickHandler.singleClick

@Composable
fun SharedCard(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color,
    onCardClick: () -> Unit
) {
    Card(
        onClick = {
            singleClick {
                onCardClick()
            }
        },
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ) {
        Text(
            color = Color.White,
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SharedCardPreview() {
    SharedCard(text = "Hello Compose", backgroundColor = Color.Red, onCardClick = {})
}