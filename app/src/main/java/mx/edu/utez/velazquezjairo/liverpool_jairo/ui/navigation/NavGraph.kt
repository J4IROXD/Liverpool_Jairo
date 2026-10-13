package mx.edu.utez.velazquezjairo.liverpool_jairo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import mx.edu.utez.velazquezjairo.liverpool_jairo.models.listaProductos
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.screens.DetallesProducto.DetallesProductoScreen
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.screens.Productos.ProductosScreen
import mx.edu.utez.velazquezjairo.liverpool_jairo.ui.screens.TituloLiverpool.TituloLiverpoolScreen

sealed class Route(val path: String) {
    object Menu : Route("menu")

    object Productos : Route("productos")

    object Detalle : Route("detalle/{id}") {
        fun crearRuta(id: String) = "detalle/$id"
    }
}

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Menu.path,
        modifier = modifier
    ) {
        composable(Route.Menu.path) {
            TituloLiverpoolScreen(
                onNavigateToProductos = { navController.navigate(Route.Productos.path) }
            )
        }

        composable(Route.Productos.path) {
            ProductosScreen(
                onBack = { navController.popBackStack() },
                onProductoClick = { producto ->
                    navController.navigate(Route.Detalle.crearRuta(producto.id))
                }
            )
        }

        composable(Route.Detalle.path) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")
            val producto = listaProductos.find { it.id == id }

            if (producto != null) {
                DetallesProductoScreen(
                    producto = producto,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}