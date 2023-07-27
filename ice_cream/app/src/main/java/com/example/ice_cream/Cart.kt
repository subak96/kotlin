package com.example.ice_cream

object Cart:Item() {
    val menus: MutableList<Menu> = mutableListOf()
    fun addmenus(menu1:Menu){
        menus.add(menu1)
    }
}