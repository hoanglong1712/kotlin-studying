import java.util.*

fun main(){
    val friends = arrayOf("Rivu", "Subin", "Sid", "Susri", "Ramya",
        "Sachin")
    println(friends)
    val info = arrayOf("Rivu", 32, 5.11, "rivu@abc.com")
    val squares = Array(51, {i -> i * i})
    val languages = arrayOf("Kotlin", "Java", "C", "C++", "C#",
        "JavaScript")
    val firstLanguage = languages[0]
    val fifthLanguage = languages[4]

    val tenthItem = languages.elementAtOrElse(9, {_ -> "Not Available"})
    val eleventhItem = languages.elementAtOrNull(10)
    println(eleventhItem)

    for (i in languages.indices) {
        if (i % 2 == 0) {
            println(languages[i])
        } else {
            println(languages[i].toUpperCase())
        }
    }

    for ((index, value) in languages.withIndex()) {
        if (index % 2 == 0) {
            println("The element at $index is $value")
        } else {
            println("The element at $index is ${value.toUpperCase()}")
        }
    }

    languages.forEach {
        println("Language in Upper Case - ${it.toUpperCase()}")
    }

    languages[1] = "Swift"
    languages[4] = "Objective-C"
    println("Newly updated languages are - ${Arrays.toString(languages)}")
}