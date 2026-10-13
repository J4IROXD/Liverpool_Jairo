package mx.edu.utez.velazquezjairo.liverpool_jairo.models

import android.R.string.no
import java.util.UUID
import mx.edu.utez.velazquezjairo.liverpool_jairo.R

data class Review(
    val title: String,
    val comment: String
)

data class ProductDetail(
    val id: String = UUID.randomUUID().toString(),
    val brand: String,
    val name: String,
    val price: Double,
    val rating: Float,
    val reviewCount: Int,
    val isFreeShipping: Boolean = true,
    val description: String,
    val image: Int?,
    val reviews: List<Review> = emptyList(),
    val isFavorite: Boolean = false
)

val listaProductos = listOf(
    ProductDetail(
        brand = "212 VIP",
        name = "Carolina Herrera 212 VIP de Parfum 100ml",
        price = 1928.0,
        rating = 4.8f,
        reviewCount = 128,
        description = "212 VIP Men es una fragancia amaderada ambarada aromática que captura la frescura helada del primer cóctel de la noche.",
        image = R.drawable._212vip,
        reviews = listOf(
            Review("Excelente aroma y duración", "El perfume es original, llegó rápido y bien empaquetado.")
        )
    ),
    ProductDetail(
        brand = "LG",
        name = "Smart TV LG 55\" 4K UHD ThinQ AI",
        price = 9999.0,
        rating = 4.6f,
        reviewCount = 85,
        description = "Pantalla 4K de 55 pulgadas con inteligencia artificial ThinQ.",
        image = R.drawable._4klg,
        reviews = listOf(
            Review("Muy buena imagen", "Se ve increíble y es fácil de configurar.")
        )
    ),
    ProductDetail(
        brand = "Nike",
        name = "Tenis Nike Air Max Para Hombre",
        price = 2899.0,
        rating = 4.7f,
        reviewCount = 64,
        description = "Tenis cómodos con amortiguación Air para uso diario.",
        image = R.drawable.nikeair,
        reviews = listOf(
            Review("Muy cómodos", "Los uso todo el día y no me lastiman, además la talla es exacta.")
        )
    ),
    ProductDetail(
        brand = "Samsung S26 FE",
        name = "Samsung Galaxy S26 FE 128GB",
        price = 12999.0,
        rating = 4.9f,
        reviewCount = 40,
        description = "El Galaxy S26 FE combina fotografía de alta resolución, capacidades de zoom óptico y procesamiento de imágenes avanzado en un solo sistema de cámara.",
        image = R.drawable.s26fe,
        reviews = listOf(
            Review("Gran cámara", "Las fotos salen increíbles y la batería me dura todo el día.")
        )
    ),
    ProductDetail(
        brand = "Lenovo LOQ",
        name = "Lenovo LOQ 15IRX10 512 GB, RTX 5050, INTEL i5",
        price = 30599.0,
        rating = 4.5f,
        reviewCount = 67,
        description = "Una computadora portátil para juegos de décima generación (Gen 10) con acabado en color Luna Grey.",
        image = R.drawable.lenovoloq,
        reviews = listOf(
            Review("Ideal para jugar", "Corre mis juegos sin problema, solo se calienta un poco después de varias horas.")
        )
    ),
    ProductDetail(
        brand = "Under Armour",
        name = "Playera Under Armour Negra",
        price = 349.0,
        rating = 4.1f,
        reviewCount = 32,
        description = "Una playera cómoda y elegante para cualquier ocasión.",
        image = R.drawable.playera,
        reviews = listOf(
            Review("Buena calidad", "La tela es fresca y no se ha deslavado después de varias lavadas."),
            Review("Material algodón con poliéster", "para tomar en cuenta, no son para secado rápido y además vienen reducidas."),
            Review("Buen material", "Considero que es buen material pero creo que la talla viene un poco reducida, apesar de decir que es loose fit siento que es más un corte straight. Por esto recomiendo pedir una talla más si buscas algo más holgado"),
            Review("No son para entrenar", "Las pedí pensando en usarlas para entrenar como la marca es deportiva y para entrenar supuse qué su ropa sería para eso, si quisiera ropa casual de vestir buscaría otras marcas. Son de algodón y no le hagan caso al que puso que vienen reducidas, las compré XL y me quedan como cobertor.")
        )
    )
)