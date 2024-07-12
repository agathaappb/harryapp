package com.harryapp.models.data

fun String.mapToHouse(): HogwartsHouse {
    return HogwartsHouse.valueOf(toString())
}