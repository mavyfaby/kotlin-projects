package factory

fun main() {
    val anm = Animal()
    val dog = Dog()
    val cat = Cat()
    val pok = Pokemon()

    println("Sounds:")
    println("Anm - " + anm.sound)
    println("Dog - " + dog.sound)
    println("Cat - " + cat.sound)
    println("Pok - " + pok.sound)
}