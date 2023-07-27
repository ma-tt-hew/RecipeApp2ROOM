package com.example.recipeappcat2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.recipeappcat2.ui.theme.RecipeTheme

class ProfileActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { RecipeTheme{ ProfileScreen(meal = meal) }
        }
    }

    private val meal: foodMeals by lazy {
        intent?.getSerializableExtra(MEAL_ID) as foodMeals
    }

    companion object { private const val MEAL_ID = "meal_id"
        fun newIntent(context: Context, meal: foodMeals) =
            Intent(context, ProfileActivity::class.java).apply { putExtra(MEAL_ID, meal) }
    }


}