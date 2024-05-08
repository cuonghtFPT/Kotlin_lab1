package cuonghtph34430.poly.lab1_md18306


// Ví dụ 1
//fun main() {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(MyClass())
//    cases("hello")
//}
//
//fun cases(obj: Any) {
//    when (obj) {                                     // 1
//        1 -> println("One")                          // 2
//        "Hello" -> println("Greeting")               // 3
//        is Long -> println("Long")                   // 4
//        !is String -> println("Not a string")        // 5
//        else -> println("Unknown")                   // 6
//    }
//}

//// Ví dụ 2
//fun main() {
//    println(whenAssign("Hello"))
//    println(whenAssign(3.4))
//    println(whenAssign(1))
//    println(whenAssign(MyClass()))
//}
//
//fun whenAssign(obj: Any): Any {
//    val result = when (obj) {                   // 1
//        1 -> "one"                              // 2
//        "Hello" -> 1                            // 3
//        is Long -> false                        // 4
//        else -> 42                              // 5
//    }
//    return result
//}
//class MyClass

//Ví dụ 3
//fun main(args: Array<String>) {
//    val cakes = listOf("carrot", "cheese", "chocolate")
//
//    for (cake in cakes) {                               // 1
//        println("Yummy, it's a $cake cake!")
//    }
//
//}

// Ví dụ 4
//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")
//
//fun main(args: Array<String>) {
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5) {                    // 1
//        eatACake()
//        cakesEaten ++
//    }
//
//    do {                                        // 2
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < cakesEaten)
//
//}

// Ví dụ 5
//class Animal(val name: String)
//
//class Zoo(val animals: List<Animal>) {
//
//    operator fun iterator(): Iterator<Animal> {             // 1
//        return animals.iterator()                           // 2
//    }
//}
//
//fun main() {
//
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//
//    for (animal in zoo) {                                   // 3
//        println("Watch out, it's a ${animal.name}")
//    }
//
//}

// Ví dụ 6
//fun main() {
//    for(i in 0..3) {             // 1
//        print(i)
//    }
//    print(" ")
//
//    for(i in 0 until 3) {        // 2
//        print(i)
//    }
//    print(" ")
//
//    for(i in 2..8 step 2) {      // 3
//        print(i)
//    }
//    print(" ")
//
//    for (i in 3 downTo 0) {      // 4
//        print(i)
//    }
//    print(" ")
//
//}

// Ví dụ 7
//fun main() {
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    print(" ")
//
//    for (c in 'z' downTo 's' step 2) { // 2
//        print(c)
//    }
//    print(" ")
//
//}

// Ví dụ 8
//fun main() {
//    val x = 2
//    if (x in 1..5) {            // 1
//        print("x is in range from 1 to 5")
//    }
//    println()
//
//    if (x !in 6..10) {          // 2
//        print("x is not in range from 6 to 10")
//    }
//}

// Ví dụ 9
//fun main() {
//
//    val authors = setOf("Shakespeare", "Hemingway", "Twain")
//    val writers = setOf("Twain", "Shakespeare", "Hemingway")
//
//    println(authors == writers)   // 1
//    println(authors === writers)  // 2
//}

// Ví dụ 10
fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}