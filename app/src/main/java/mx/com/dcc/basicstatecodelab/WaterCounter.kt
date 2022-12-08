package mx.com.dcc.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.com.dcc.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        if (count > 0) {
            Text(text = "You've $count glasses")
        }
        Button(onClick = { count++ }, modifier = modifier.padding(top = 8.dp)) {
            Text(text = "Add one")
        }
    }
}

@Preview(
    showBackground = true,
    name = "WaterCounter",
    heightDp = 320
)
@Composable
fun WaterCounterPreview() {
    BasicStateCodelabTheme {
        WaterCounter(modifier = Modifier.fillMaxWidth())
    }
}