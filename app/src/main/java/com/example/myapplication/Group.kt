package com.example.myapplication

import java.util.*

class Group(n:String){
    var name  = n
    var schedule:Array<Date> = arrayOf(Date(), Date())
    var Teacher:Teacher? =  null
    fun display() {
        println(name)
        println(Teacher)
    }


}