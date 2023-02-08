fun main() {
    greetings( "mercy")
    greetings( "dorothy")
    greetings( "eunice")

    modulus(67,8)
    modulus(57,30)

    addnumbers(6,8)
    addnumbers(34,7)
    addnumbers(16,4)
    addnumbers(5,8)

    personality()
}
fun greetings(name: String){
    println("hello" +name)

}

fun modulus(num1:Int,num2:Int){
    var remainder = num1 % num2
    println(remainder)


}
fun addnumbers(num1: Int ,num2: Int){
    var sum = num1 + num2
    println(sum)
}

fun personality(){
    println("love peace")
}



