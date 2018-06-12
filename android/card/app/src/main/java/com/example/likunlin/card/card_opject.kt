package com.example.likunlin.card

import java.util.*
import kotlin.collections.ArrayList

class card_objects(val card_type:String,val card_img :Int)



class card_list: ArrayList<card_objects>() {
    fun get():ArrayList<card_objects> {
        val card_list_1 = ArrayList<card_objects>()
        card_list_1.add(card_objects(card_type = "a",card_img = R.drawable.a1))
        card_list_1.add(card_objects(card_type = "b",card_img = R.drawable.a2))
        card_list_1.add(card_objects(card_type = "c",card_img = R.drawable.a3))
        card_list_1.add(card_objects(card_type = "d",card_img = R.drawable.a4))
        card_list_1.add(card_objects(card_type = "a",card_img = R.drawable.a5))
        card_list_1.add(card_objects(card_type = "b",card_img = R.drawable.a6))
        card_list_1.add(card_objects(card_type = "c",card_img = R.drawable.a7))
        card_list_1.add(card_objects(card_type = "d",card_img = R.drawable.a8))
        card_list_1.add(card_objects(card_type = "a",card_img = R.drawable.a9))
        card_list_1.add(card_objects(card_type = "b",card_img = R.drawable.a10))
        return card_list_1
    }
}