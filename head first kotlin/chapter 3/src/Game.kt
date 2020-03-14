fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    updateArray(options)
    println(options[2])
    val userInput = getUserOption(options)
}

fun getUserOption(optionParam: Array<String>) : String? {
    var isValidChoise = false
    var userChoice = ""
    while (!isValidChoise){
        print("enter one of the following ")
        for (item in optionParam)
            print(" $item")
        println(".")
        val userIntput = readLine()
        if (userIntput != null
            && userIntput in optionParam) {
            isValidChoise = true;
            return userIntput
        }
        println("Invalid")
    }
    return null
}

fun updateArray(optionsParam: Array<String>) {
    optionsParam[2] = "Fred"
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() *
            optionsParam.size).toInt()]
