package com.example.recipeappcat2

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun RecipeHomeContent(navigateToProfile: (foodMeals) -> Unit) {
    val meals = remember { FoodData.mealList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp)
    ) {
        items(
            items = meals,
            itemContent = {
                MealListItem(meal = it, navigateToProfile)
            })
    }
}