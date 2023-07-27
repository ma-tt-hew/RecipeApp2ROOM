package com.example.recipeappcat2.database

import androidx.lifecycle.LiveData

class MealRepository(private val recipeDOA:recipeDatabaseDOA ) {

val readAllData : List<Recipez> = recipeDOA.getAllMeals()

    suspend fun addMeal(recipez: Recipez){
        recipeDOA.insertMeal(recipez)
    }

}