package com.example.mytrifit.model.product

open class Product(
    var nomprod:String,
    var priceProduct:Int,
    var remis:Int,
    var icon:Int
) {
    open fun getProductWithRemis(): Int {
        return 112
    }
}
