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
fun Ej5() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ){
            Row(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.Cyan)
            ){
                Text("Ejemplo 1")
            }

            Spacer(
                modifier = Modifier
                    .height(16.dp)
                    .fillMaxWidth()
                    .background(Color.Transparent)
            )

            Row(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.Gray)
            ){
                Text("Ejemplo 2")
            }

            Spacer(
                modifier = Modifier
                    .height(16.dp)
                    .fillMaxWidth()
                    .background(Color.Transparent)
            )

            Row(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.Green)
            ){
                Text("Ejemplo 3")
            }

            Spacer(
                modifier = Modifier
                    .height(16.dp)
                    .fillMaxWidth()
                    .background(Color.Transparent)
            )

            Row(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.Magenta)
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
        Ej5()
    }
}