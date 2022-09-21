package com.ayd.narutoapp.di

import android.content.Context
import androidx.room.Room
import com.ayd.narutoapp.data.local.NarutoDatabase
import com.ayd.narutoapp.util.Constant.NARUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module //how to provide instance to room. we want to provide it as a singleton
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        NarutoDatabase::class.java,
        NARUTO_DATABASE
    ).build()


}