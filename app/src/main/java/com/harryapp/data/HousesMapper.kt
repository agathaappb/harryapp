package com.harryapp.data

fun String.mapToHouse():HogwartsHouse{
    return HogwartsHouse.valueOf(toString())
}