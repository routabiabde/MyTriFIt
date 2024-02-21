package com.example.mytrifit.model.product

class foodCompliment(
    var nomComplimet:String,
    var priceComplment:Int,
    var remisComment:Int,
    var iconComp:Int,
) :Product(nomComplimet,priceComplment,remisComment,iconComp){
    override fun getProductWithRemis(): Int {
        return super.getProductWithRemis()
    }
}