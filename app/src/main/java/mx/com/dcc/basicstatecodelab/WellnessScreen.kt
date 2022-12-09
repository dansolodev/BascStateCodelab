package mx.com.dcc.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import mx.com.dcc.basicstatecodelab.model.WellnessTask

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter(modifier)
        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTaskList(list = list) { task -> list.remove(task) }
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }