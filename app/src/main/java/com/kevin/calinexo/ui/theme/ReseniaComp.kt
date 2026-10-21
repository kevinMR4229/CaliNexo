package com.kevin.calinexo.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Resenia(
    val nombreAutor: String,
    val reseniaText: String,
    val rating: Int,
)

// Es mejor pasarle la reseña que pasarle campo a campo, asi si a¡cambio algo solo lo cambio en la clase reseña
@Composable
fun FilaResenia(resenia: Resenia){
    Row(modifier = Modifier){

        LogoIniciales(resenia.nombreAutor)

        Spacer(modifier = Modifier.width(2.dp))

        Column(modifier = Modifier) {
            Row(modifier = Modifier) {
                Text(text = resenia.nombreAutor)

                RatingComponent(resenia.rating)
            }
            Text(text = resenia.reseniaText, modifier = Modifier)
        }

    }
}

@Composable
fun LogoIniciales(nombreAutor: String) {

}

@Composable
fun RatingComponent(rating: Int) {
    Text(
        text = "$rating",
        color = MaterialTheme.colorScheme.primary,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium
    )
}


@Preview(showBackground = true, name = "Fila Resenia Light Mode")
@Composable
fun FilaReseniaPreview() {
    // Creamos un objeto de datos de prueba (Mock data)
    val reseniaDePrueba = Resenia(
        nombreAutor = "Juan Pérez",
        reseniaText = "Excelente servicio y atención al cliente. Muy recomendado.",
        rating = 5
    )

    // Invocamos el componente pasando el objeto de prueba
    FilaResenia(resenia = reseniaDePrueba)
}


//@Preview(showBackground = true)
//@Composable
//fun preview(){
//    MaterialTheme(){
//        ResComponent()
//    }
//}