package com.example.recipeappcat2

import java.io.Serializable

data class foodMeals(
    val mealId: Int,
    val mealName: String,
    val type: String,
    val mealServings: Int,
    val difficulty: String,
    val ingredients: String,
    val recipeGuide: String,
    val mealImageId: Int = 0
) :Serializable
