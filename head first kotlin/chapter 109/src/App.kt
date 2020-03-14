fun main(){
    var catContest = Contest<Pet>()

    catContest.addScore(Cat("a cat"), 50)
    catContest.addScore(Cat("2 cat"), 45)
    val topCat = catContest.getWinners().first()
    catContest.addScore(Cat("3 cat"), 23)

    print(topCat.name)

}