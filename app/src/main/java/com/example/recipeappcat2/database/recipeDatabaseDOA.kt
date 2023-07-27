package com.example.recipeappcat2.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface recipeDatabaseDOA {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMeal(meal: Recipez)

    @Query("SELECT * FROM Food_recipe_table ORDER BY mealId ASC")
     fun getAllMeals(): List<Recipez>

    @Query("SELECT * FROM Food_recipe_table WHERE mealId = :id")
    suspend fun getMealById(id: Long): Recipez?

    @Query("DELETE FROM Food_recipe_table WHERE mealId = :id")
    suspend fun deleteMealById(id: Long)


}