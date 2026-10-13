package mx.edu.utez.velazquezjairo.liverpool_jairo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.navigation.AppNavGraph
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.theme.Liverpool_JairoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Liverpool_JairoTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        AppNavGraph(
                            navController = navController,
                            modifier = Modifier.padding(innerPadding)
                        )
                }
            }
        }
    }
}
