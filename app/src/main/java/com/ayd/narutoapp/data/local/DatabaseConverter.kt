package com.ayd.narutoapp.data.local

import androidx.room.TypeConverter

//https://prnt.sc/GdIv4tnvEG9o
class DatabaseConverter {

    //convert:
    //list of strings -> simple string
    //simple string -> list of string

    private val separator = ","

    @TypeConverter
    fun convertListToString(list: List<String>):String{
        val stringBuilder = StringBuilder()
        for (item in list){
            stringBuilder.append(item).append(separator)
        }

        stringBuilder.setLength(stringBuilder.length-separator.length)
        return stringBuilder.toString()
    }

    @TypeConverter
    fun convertToStringToList(string: String):List<String>{
        return string.split(separator)  //split method convert it to a list after removing the commas. split return List<String>
    }



}