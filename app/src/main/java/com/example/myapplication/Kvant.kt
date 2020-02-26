package com.example.myapplication
fun make_Group(name:String,Teacher ;String):Group(){
    var temp = Group(name)
    for( i in 1..space!!)
        temp.student.add(Student())
    temp.Teacher = Teacher
    Group.add(temp)
    return temp
}
var space:Int? = null
var name:String?= null
var desc:String?= null
var groups:MutableList<Group> = mutableListOf()
        var teachers:Array<Teacher?> = null
fun display(){
    println(space)
    println(desc)
   teachers?.forEach { it.display() }
   groups?.forEach { it.display() }
}

