package com.example.recipeappcat2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.recipeappcat2.ui.theme.RecipeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTheme {
                MyApp{
                    startActivity(ProfileActivity.newIntent(this, it))
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(navigateToProfile: (foodMeals) -> Unit){
    Scaffold(
        content = {
            RecipeHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}
