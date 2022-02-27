fun main() {
    val likes = 111
    val singular = "человеку"
    val plural = "людям"

    val people = if (likes % 10 == 1 && (likes - 11) % 100 != 0) singular else plural
    println("Понравилось $likes $people")
}