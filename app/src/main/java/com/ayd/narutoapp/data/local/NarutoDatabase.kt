package com.ayd.narutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ayd.narutoapp.data.local.dao.HeroDao
import com.ayd.narutoapp.data.local.dao.HeroRemoteKeyDao
import com.ayd.narutoapp.domain.model.Hero
import com.ayd.narutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1) //models here
@TypeConverters(DatabaseConverter::class)
abstract class NarutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKey(): HeroRemoteKeyDao

}