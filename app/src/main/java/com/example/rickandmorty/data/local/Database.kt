package com.example.rickandmorty.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [HeroEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao

}