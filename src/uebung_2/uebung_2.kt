package uebung_2

// Aufgabe 1

fun power(x: Long, exp: Int): Long {
    if (x.compareTo(0) == 0) return 0
    var result: Long = 1
    repeat(exp) {
        result *= x
    }
    return result
}

/**
 * REQUIRES: input <= 0
 */
fun binaryIntToDecimal(input: Long): Long {
    var n = input
    var result: Long = 0
    var position = 0
    while (n > 0) {
        var lastBit: Long = n % 10
        if (lastBit.compareTo(1) == 0) {
            result += lastBit * power(2, position)
        }
        position++
        n /= 10
    }
    return result;
}

// Aufgabe 1a
/**
 * REQUIRES: input starts with 1 or is a single 0
 */
fun binaryStringToDecimal(input: String): Long {
    return binaryIntToDecimal(input.toLong())
}






























// Aufgabe 2

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    var i = n - 1;
    while (i >= 2) {
        if (n % i == 0) return false
        i -= 1
    }
    return true
}


























// Aufgabe 3
fun reverseString(input: String): String {
    var result = ""
    for (i in input) {
        result = i + result
    }
    return result
}


fun reverseStringRecursive(input: String): String {
    if (input.isEmpty()) return ""
    else return reverseStringRecursive(input.drop(1)) + input[0]
}





























// Aufgabe 4
fun countWords(input: String): Int = input.split(' ', '\n', '\t').count { it.isNotEmpty() }























// Aufgabe 5
fun checkParenthesis(s: String): Boolean {
    var openBracketsCount = 0
    for (c in s) {
        if (c == '(') openBracketsCount++
        if (c == ')') openBracketsCount--
        if (openBracketsCount < 0) return false
    }
    return openBracketsCount == 0
}




























// Aufgabe 6
fun caesarEncrypt(s: String, offset: Int): String {
    var result = ""
    for (c in s) {
        result += if (c.isLetter()) {
            val base = if (c.isLowerCase()) 'a' else 'A'
            val max = if (c.isLowerCase()) 'z' else 'Z'
            var newCharCode = c.code + offset
            if (newCharCode < base.code) {
                newCharCode += 26
            } else if (newCharCode > max.code) {
                newCharCode -= 26
            }
            newCharCode.toChar()
        } else c
    }
    return result
}

/**
 * @author Eren
 */
fun caesarEncryptEren(s:String, offset:Int):String{
    var encryptedString = ""
    for (c in s){
        if (c.isLetter()){
            val base = if (c.isUpperCase()) 'A' else 'a'
            val shifted = ((c.minus(base).plus(offset))%26 + 26) % 26
            encryptedString += base.plus(shifted)
        }
        else encryptedString += c
    }
    return encryptedString
}
























// Aufgabe Weihnachtsbaum
/**
 * @author Eren
 */
fun christmasTree(size: Int): String {
    var triangle = ""
    for (i in 1..size) {
        triangle += "_".repeat(size - i) + "*".repeat(2 * i - 1) + "_".repeat(size - i) + "\n"
    }
    return triangle
}





















fun main() {
    println(christmasTree(10))
}