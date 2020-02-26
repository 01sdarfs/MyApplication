package com.example.myapplication

import java.util.*

open class Man {
    var firstName: String? = null
    var secondName: String? = null
    var thirdName: String? = null
    var birthDate: Date = Date()
    fun display() {
        println(firstName + "" + secondName + "" + thirdName)
        println(birthDate)
    }

    class Student : Man() {
        init {
            firstName = names(Random.nextInt(names.size))
            secondName = surnames(Random.nextInt(surnames.size))
            thirdName = otch(Random.nextInt(otch.size))
        }

        override fun toString(): String {
            return "$firstName $secondName $thirdName"
        }

    }

    class Teacher (name:String,surnames :String,otch1:String):Man() {
        init {
            firstName = name
            secondName = surnames
            thirdName = otch1
        }
    }
}