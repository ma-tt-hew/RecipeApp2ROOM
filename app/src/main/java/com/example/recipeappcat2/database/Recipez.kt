package com.example.recipeappcat2.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Food_recipe_table")
data class Recipez (

    @PrimaryKey(autoGenerate = true)
    val mealId: Long = 0L,

    @ColumnInfo(name = "mealName")
    val mealName: String,

    @ColumnInfo(name = "mealServings")
    val mealServings: Int,

    @ColumnInfo(name = "difficulty")
    val difficulty: String,

    @ColumnInfo(name = "ingredients")
    val ingredients: String,

    @ColumnInfo(name = "recipeGuide")
    val recipeGuide: String
)





