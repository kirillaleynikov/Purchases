package com.example.purchases.entities.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.purchases.entities.entitites.LibraryItem
import com.example.purchases.entities.entitites.NoteItem
import com.example.purchases.entities.entitites.ShoppingListItem
import com.example.purchases.entities.entitites.ShoppingListName

@Database(
    entities = [
        LibraryItem::class,
        NoteItem::class,
        ShoppingListItem::class,
        ShoppingListName::class
    ],
    version = 1
)

abstract class MainDataBase : RoomDatabase(){
    companion object{
        @Volatile
        private var INSTANCE: MainDataBase? = null

        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list_db"
                ).build()
                instance
            }
        }
    }
}