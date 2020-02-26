package com.example.myapplication
var descs :Array<String> = arrayOf("Ит квантум","БиоКвантум","Робоквантум","Аэроквантум")
var space :Array<Int> = arrayOf(12,14,15,15)
var kvantNames :Array<String> = arrayOf("IT","Bio","Robo","Aero")
class Kvantoriums{
    fun make_Kvant(type:String):Kvant{
        var k:Kvant = Kvant()
        when(type){
            "IT"->{
            k.name  = kvantNames[0]
                k.space = space[0]
                k.desks = descs[0]
            }
            "Bio"->{
                k.name  = kvantNames[1]
                k.space = space[1]
                k.desks = descs[1]
            }
            "Robo"->{
                k.name  = kvantNames[2]
                k.space = space[2]
                k.desks = descs[2]
            }
            return k
        }
    }
}