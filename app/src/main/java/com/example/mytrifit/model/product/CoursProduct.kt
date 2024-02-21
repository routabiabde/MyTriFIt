package com.example.mytrifit.model.product

class CoursProduct (
    var nomCours:String,
    var priceCours:Int,
    var remisCours:Int,
    var lenghtCours:Int,
    var iconCour:Int,
):Product(nomCours,priceCours,remisCours,iconCour){

    override fun getProductWithRemis(): Int {
        return super.getProductWithRemis()
    }

}