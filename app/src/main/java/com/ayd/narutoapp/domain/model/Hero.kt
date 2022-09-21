package com.ayd.narutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ayd.narutoapp.util.Constant.HERO_DATABASE_TABLE

@Entity(tableName = HERO_DATABASE_TABLE)
data class Hero(
    @PrimaryKey(autoGenerate = false)   //in our server, our characters id are unique already. So, we don't need auto primary key.
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,           //room db does not know how to save a list of strings into a database.
    val abilities: List<String>,        //So, we need to tell to room db how those lists should be saved into a db and retrieve the back
    val natureTypes: List<String>       //create type converter class ;)
)

//https://prnt.sc/GdIv4tnvEG9o          //Click to link with (ctrl+left mouse) and you will see the explanations above.
                                        //and go to DatabaseConverter class