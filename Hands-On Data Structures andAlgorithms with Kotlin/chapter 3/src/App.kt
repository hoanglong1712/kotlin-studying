fun main(){
    val linkyList = LinkyList<String>()
    linkyList.addLast("Kotlin")
    linkyList.addLast("Java")
    linkyList.addLast("C#")
    linkyList.addLast("C")
    linkyList.addLast("C++")
    println("JavaScript" in linkyList)
    println("Kotlin" in linkyList)
}