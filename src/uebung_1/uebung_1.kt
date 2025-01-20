package uebung_1


// Aufgabe 1
val constant: Int = 5
fun isBiggerThenConstant(x: Int) = x > constant

fun main() {
    print(-5%3)
}































// Aufgabe 2
fun square(x: Int) = x * x



































// Aufgabe 3
fun max(x: Int, y: Int) = if (x > y) x else y

































// Aufgabe 4
fun abs(x: Int) = if (x < 0) -x else x

































// Aufgabe 5
// REQUIRES: x >= 0 & y > 0
fun modulo(x: Int, y: Int) = x - (y * (x / y))




































// Aufgabe 6
// REQUIRES: n > 0
fun factorialRecursive(n: Long): Long {
    if (n <= 1) return 1
    else return n * factorialRecursive(n - 1)
}




































// REQUIRES: n > 0
fun factorialIterative(n: Int): Int {
    if (n <= 1) return 1
    else {
        var result = 1
        var current = n
        while (current > 0) {
            result *= current
            current -= 1
        }
        return result
    }
}





























// Aufgabe 7
fun calculateIntersection(a1: Double, b1: Double, a2: Double, b2: Double): String {
    if (a1 == a2) {
        if (b1 == b2) {
            return "Die Geraden sind identisch (unendlich viele Schnittpunkte)."
        } else {
            return "Die Geraden sind parallel und schneiden sich nicht."
        }
    }

    val x = (b2-b1) / (a1-a2)
    val y = a1 * x + b1

    return "($x, $y)"
}
















