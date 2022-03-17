fun main(){

    words()
    var x =numbers(50,3)
    println(x)
    var y = identification("Queenter","24")
    println(y)
    var q =sentence("Achieng")
    println(q)
    select("queenter")
}
fun words(){
    var  school = "CodeHive"
     var char1 = "CodeHive"[4]
   var char2 = "CodeHive"[5]
    var char3 = "CodeHive"[6]
    var char4 = "CodeHive"[7]
    println(char1.toString()+char2+char3+char4)
    }
fun numbers(a:Int,b:Int):Int{
    var modulus = a % b
    return modulus
}
fun identification(p:String,z:String):String{
    var output=("Hi,my name is $p and i am $z years old")

    return output


}
fun sentence(name:String):Int{
    var words = name.length

    return words


}
fun select(s:String):String{
    println(s[4].toString()+s[5]+s[6]+s[7])
    return s
}




