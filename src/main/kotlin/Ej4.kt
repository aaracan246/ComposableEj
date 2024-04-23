import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun Ej4() {
    Box(
        modifier = Modifier.fillMaxSize(),

        contentAlignment = Alignment.BottomCenter
    ) {
        Column( verticalArrangement = Arrangement.Bottom) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,

                modifier = Modifier.fillMaxWidth())
            {

                Box(
                    modifier = Modifier
                        .size(75.dp, 150.dp)
                        .border(3.dp, Color.Red)
                        .align(Alignment.Bottom)
                ) {
                    Text("Ejemplo 1")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .size(75.dp, 125.dp)
                        .border(3.dp, Color.Blue)
                        .align(Alignment.Bottom)
                ) {
                    Text("Ejemplo 2")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .size(75.dp, 85.dp)
                        .border(3.dp, Color.Red)
                        .align(Alignment.Bottom)
                ) {
                    Text("Ejemplo 3")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .size(75.dp, 45.dp)
                        .border(3.dp, Color.Blue)
                        .align(Alignment.Bottom)
                ) {
                    Text("Ejemplo 4")
                }
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
        Ej4()
    }
}