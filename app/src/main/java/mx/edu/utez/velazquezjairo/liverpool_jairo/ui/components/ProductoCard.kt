package mx.edu.utez.velazquezjairo.liverpool_jairo.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import mx.edu.utez.velazquezjairo.liverpool_jairo.models.ProductDetail
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.theme.RosaLiverpool

@Composable
fun ProductoCard(
    producto: ProductDetail,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            ImagenProducto(
                image = producto.image,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
            )

            Text(
                text = producto.name,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = "$%,.2f".format(producto.price),
                color = RosaLiverpool,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 4.dp)
            )

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = RosaLiverpool),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            ) {
                Text(text = "Agregar")
            }
        }
    }
}

@Composable
fun ImagenProducto(
    image: Int?,
    modifier: Modifier = Modifier
) {
    if (image != null) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Imagen del producto",
            contentScale = ContentScale.Fit,
            modifier = modifier.clip(RoundedCornerShape(12.dp))
        )
    } else {
        Box(
            modifier = modifier
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF3E5F5))
        )
    }
}