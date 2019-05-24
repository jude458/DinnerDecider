package com.example.codeswag.Service

import com.example.codeswag.Model.Category
import com.example.codeswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val  hats = listOf(
        Product("Black Cap red ","2,000","hat1"),
        Product("Black Cap hood ","2,000","hat2"),
        Product("pink Cap red ","2,000","hat3"),
        Product("white cap red ","2,000","hat4")
    )

    val shirts = listOf(
        Product("balck-T Shirt ","4,0000","shirt1"),
        Product("Green-T Shirt ","4,0000","shirt2"),
        Product("white-T Shirt ","4,0000","shirt3"),
        Product("Tommy-T Shirt ","4,0000","shirt4"),
        Product("CK-T Shirt ","4,0000","shirt5")

    )
    val hoodies = listOf(
        Product("chicago white  hoodie", "3,000","hoodie1"),
        Product("lagos  Red  hoodie", "3,000","hoodie2"),
        Product("chicago  hoodie", "3,000","hoodie3"),
        Product("chicago pink  hoodie", "3,000","hoodie3")

    )
}