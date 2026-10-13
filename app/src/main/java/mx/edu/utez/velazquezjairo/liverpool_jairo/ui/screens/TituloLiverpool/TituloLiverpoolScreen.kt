package mx.edu.utez.velazquezjairo.liverpool_jairo.ui.screens.TituloLiverpool

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mx.edu.utez.velazquezjairo.liverpool_jairo.R


@Composable
fun TituloLiverpoolScreen(
    modifier: Modifier = Modifier,
    onNavigateToProductos: () -> Unit
) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.liverpoollogo),
            contentDescription = "Logo de Liverpool",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Liverpool",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(top = 32.dp)
        )
        Text(
            text = "Es parte de mi vida",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 10.dp)
        )

        Button(
            onClick = onNavigateToProductos,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
        ) {
            Text(text = "Ver los productos")
        }
    }
}