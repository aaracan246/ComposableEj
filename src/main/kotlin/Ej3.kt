import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


@Composable
@Preview
fun Ej3() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ){
            Row(modifier = Modifier
                .size(75.dp, 150.dp)
                .background(Color.Red)
            ){
                Text("Ejemplo 1")
            }

            Row(modifier = Modifier
                .size(75.dp, 150.dp)
                .background(Color.Gray)
            ){
                Text("Ejemplo 2")
            }

            Row(modifier = Modifier
                .size(75.dp, 150.dp)
                .background(Color.Cyan)
            ){
                Text("Ejemplo 3")
            }

            Row(modifier = Modifier
                .size(75.dp, 150.dp)
                .background(Color.Green)
            ){
                Text("Ejemplo 4")
            }
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))


    Window(
        onCloseRequest = ::exitApplication,
        title = "Mi Login",
        state = windowState
    ) {
        Ej3()
    }
}