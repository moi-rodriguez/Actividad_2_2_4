package com.example.actividad_2_2_4.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.actividad_2_2_4.navigation.Screen
import com.example.actividad_2_2_4.viewmodels.MainViewModel

@Composable
fun SettingsScreen(
    navController: NavController,   // Controlador de navegación para moverse entre pantallas
    viewModel: MainViewModel        // ViewModel que centraliza la navegación (eventos)
) {
    // Estructura visual centralizada
    Column(
        modifier = Modifier
            .fillMaxSize()                                  // Ocupar toodo el alto disponible
            .padding(16.dp),                            // Margen interno general
        verticalArrangement = Arrangement.Center,           // Centrar elementos verticalmente
        horizontalAlignment = Alignment.CenterHorizontally  // Centrer elementos horizontalmente
    ) {
        // Titulo o texto principal
        Text(text = "Pantalla de Configuración (Settings)" )

        Spacer(modifier = Modifier.height(24.dp)) // Espacio vertical

        // Botón para volver al Home
        Button(
            onClick = {
                viewModel.navigateTo(Screen.Home) // Emitir evento de navegación al ViewModel
            }
        ) {
            Text("Volver al Inicio")
        }

        Spacer(modifier = Modifier.height(16.dp)) // Más espacio

        // Botón para ir al Perfil
        Button(
            onClick = {
                viewModel.navigateTo(Screen.Profile) // Emitir evento para ir a perfil
            }
        ) {
            Text("Ir a Perfil")
        }
    }
}