package org.utl.ejemplo2composeridgs901
import android.os.Bundleimport
androidx.activity.ComponentActivity
import androidx.activity.compose.setContentimport
androidx.activity.enableEdgeToEdgeimport
androidx.compose.foundation.BorderStrokeimport
androidx.compose.foundation.layout.Arrangementimport
androidx.compose.foundation.layout.Columnimport
androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacerimport
androidx.compose.foundation.layout.fillMaxSizeimport
androidx.compose.foundation.layout.fillMaxWidthimport
androidx.compose.foundation.layout.heightimport androidx.compose.foundation.layout.paddingimport
androidx.compose.foundation.layout.sizeimport androidx.compose.material.icons.Iconsimport androidx.compose.material.icons.filled.Favoriteimport androidx.compose.material3.Buttonimport androidx.compose.material3.CardDefaultsimport androidx.compose.material3.Iconimport androidx.compose.material3.MaterialThemeimport androidx.compose.material3.OutlinedCardimport androidx.compose.material3.Scaffoldimport androidx.compose.material3.Textimport androidx.compose.material3.TextFieldimport androidx.compose.runtime.Composableimport androidx.compose.runtime.getValueimport androidx.compose.runtime.mutableStateOfimport androidx.compose.runtime.rememberimport androidx.compose.runtime.saveable.rememberSaveableimport androidx.compose.runtime.setValueimport androidx.compose.ui.Alignmentimport androidx.compose.ui.Modifierimport androidx.compose.ui.text.style.TextAlignimport androidx.compose.ui.tooling.preview.Previewimport androidx.compose.ui.unit.dpimport androidx.navigation.NavHostControllerimport androidx.navigation.compose.NavHostimport androidx.navigation.compose.composableimport androidx.navigation.compose.rememberNavControllerimport
import org.utl.ejemplo2composeridgs901.ui.theme.Ejemplo2ComposerIDGS901Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "inicio") {
                composable("inicio") { PantallaInicio(navController) }
                composable("detalle/{nombre}") { backStackEntry ->

                    val nombre = backStackEntry.arguments?.getString("nombre") ?: "Invitado"
                    PantallaDetalle(navController, nombre)
                }
            }
        }
    }

    @Composable
    fun PantallaInicio(navController: NavHostController) {
        var nombres = remember { mutableStateOf("") }

    }










}
