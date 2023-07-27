package com.example.recipeappcat2.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
/*
class MealViewModel(application: Application): AndroidViewModel(application) {

private val readAllData: LiveData<List<Recipez>>
private val repository: MealRepository

init {
    val recipeDOA = MealDatabase.getDatabase(application).recipeDOA()
    repository = MealRepository(recipeDOA)
    readAllData = repository.readAllData

}
    fun addMeal(recipez: Recipez){
        viewModelScope.launch ( Dispatchers.IO) {
            repository.addMeal(recipez)
        }
    }

}


 */