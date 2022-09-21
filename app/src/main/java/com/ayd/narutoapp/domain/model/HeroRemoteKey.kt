package com.ayd.narutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ayd.narutoapp.util.Constant.HERO_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,  //questionMark -> first and last Page can be null!
    val nextPage: Int?
)
