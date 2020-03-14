interface Roamable {
    var velocity: Int
        get() = 20
        set(value) {
            print("Nothing")
        }


    fun roam(){
        println("Roanming")
    }
}