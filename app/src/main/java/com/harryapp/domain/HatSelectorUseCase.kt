package com.harryapp.domain

import com.harryapp.R
import com.harryapp.data.HogwartsHouse
import com.harryapp.data.mapToHouse

class HatSelectorUseCase() {

    fun getSelectorHouse():Int{
        return dataSelectorHouse()
    }

    private fun dataSelectorHouse():Int{
        val houses = listOf(
            "GRYFFINDOR",
            "HUFFLEPUFF",
            "REVENCLAW",
            "SLYTHERIN")

        val selectedHouse = houses.random().mapToHouse()

       return when(selectedHouse){
            HogwartsHouse.GRYFFINDOR -> R.drawable.house_gryffindor_1
            HogwartsHouse.HUFFLEPUFF -> R.drawable.house_hufflepuff_2
            HogwartsHouse.REVENCLAW -> R.drawable.house_ravenclaw_3
            HogwartsHouse.SLYTHERIN -> R.drawable.house_slytherin_4
            else -> {
                R.drawable.harry_potter_house
            }
        }
    }




}