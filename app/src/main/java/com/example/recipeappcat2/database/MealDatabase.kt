package com.example.recipeappcat2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recipeappcat2.database.Recipez
import java.security.AccessControlContext

@Database(entities = [Recipez::class], version = 1, exportSchema = false)
abstract class MealDatabase: RoomDatabase() {

    abstract fun recipeDOA() : recipeDatabaseDOA

    companion object{
        @Volatile
        private var INSTANCE : MealDatabase? = null

        fun getDatabase(context:Context) : MealDatabase{

            val tempInstance = INSTANCE

            if (tempInstance != null){
            return tempInstance
            }
        synchronized (this){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                MealDatabase::class.java,
                "meal_database"
            ).build()
            INSTANCE = instance
            return instance
        }
        }

    }

}