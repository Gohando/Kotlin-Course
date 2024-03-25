const val HERO_NAME = "Madrigal"
fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel = 1
    println(playerLevel)
    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the land of soft things.")
    } else {
        println("Locate the enchanted sword.")
    }
    println("Time passes...")
    println("The hero returns from her quest.")
    playerLevel += 1
    println(playerLevel)
}