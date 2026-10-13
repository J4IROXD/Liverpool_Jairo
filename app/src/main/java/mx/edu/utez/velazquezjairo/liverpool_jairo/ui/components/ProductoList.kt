package mx.edu.utez.velazquezjairo.liverpool_jairo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mx.edu.utez.velazquezjairo.liverpool_jairo.models.ProductDetail

@Composable
fun ProductoList(
    productos: List<ProductDetail>,
    onProductoClick: (ProductDetail) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(productos) { producto ->
            ProductoCard(
                producto = producto,
                onClick = { onProductoClick(producto) }
            )
        }
    }
}