package uebung_2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class uebung_2Test_done {

    @Test
    fun testPower() {
        assertEquals(0, power(0, 0))
        assertEquals(1, power(4, 0))
        assertEquals(1, power(10, 0))
        assertEquals(100, power(10, 2))
        assertEquals(160_000, power(400, 2))
    }

    @Test
    fun testBinaryIntToDecimal() {
        assertEquals(0, binaryIntToDecimal(0));
        assertEquals(13, binaryIntToDecimal(1101));
        assertEquals(12, binaryIntToDecimal(1100));
        assertEquals(11, binaryIntToDecimal(1011));
    }

    @Test
    fun testBinaryStrimgToDecimal() {
        assertEquals(0, binaryStringToDecimal("0"));
        assertEquals(13, binaryStringToDecimal("1101"));
        assertEquals(12, binaryStringToDecimal("1100"));
        assertEquals(11, binaryStringToDecimal("1011"));
    }

    @Test
    fun testIsPrime() {
        assertEquals(true, isPrime(3))
        assertEquals(true, isPrime(5))
        assertEquals(true, isPrime(2))
        assertEquals(false, isPrime(1))
        assertEquals(false, isPrime(0))
        assertEquals(false, isPrime(6))
        assertEquals(false, isPrime(4))
        assertEquals(true, isPrime(99991))
    }

    @Test
    fun testReverseString() {
        assertEquals("olleH", reverseString("Hello"));
        assertEquals("dlroW", reverseString("World"));
        assertEquals("avaJ", reverseString("Java"));
        assertEquals("gnimmargorP", reverseString("Programming"));
        assertEquals("etisbew", reverseString("website"));
        assertEquals("12345", reverseString("54321"));
        assertEquals("!dlroW ,olleH", reverseString("Hello, World!"));
        assertEquals("ti kcehc", reverseString("check it"));
        assertEquals("gnitset", reverseString("testing"));
        assertEquals("54321 67890", reverseString("09876 12345"));
    }

    @Test
    fun testReverseStringRecursive() {
        assertEquals("olleH", reverseStringRecursive("Hello"));
        assertEquals("dlroW", reverseStringRecursive("World"));
        assertEquals("avaJ", reverseStringRecursive("Java"));
        assertEquals("gnimmargorP", reverseStringRecursive("Programming"));
        assertEquals("etisbew", reverseStringRecursive("website"));
        assertEquals("12345", reverseStringRecursive("54321"));
        assertEquals("!dlroW ,olleH", reverseStringRecursive("Hello, World!"));
        assertEquals("ti kcehc", reverseStringRecursive("check it"));
        assertEquals("gnitset", reverseStringRecursive("testing"));
        assertEquals("54321 67890", reverseStringRecursive("09876 12345"));
    }

    @Test
    fun testCountWords() {
        assertEquals(1, countWords("Hello"));
        assertEquals(5, countWords("This is a simple test"));
        assertEquals(4, countWords("This   has   extra spaces"));
        assertEquals(0, countWords("   "));
        assertEquals(0, countWords(""));
        assertEquals(4, countWords("Hello, world! This works."));
        assertEquals(1, countWords("!@#$%^&*()"));
        assertEquals(3, countWords("123 456 789"));
        assertEquals(5, countWords("Test123 with numbers and words!"));
        assertEquals(4, countWords("Words\non\tdifferent lines"));
    }

    @Test
    fun testCheckParenthesis() {
        assertEquals(true, checkParenthesis("()"));
        assertEquals(true, checkParenthesis("(())()"));
        assertEquals(false, checkParenthesis("(()))()"));
        assertEquals(true, checkParenthesis("(foo)(bar())"));
        assertEquals(false, checkParenthesis("(foo))((bar())"));
        assertEquals(true, checkParenthesis("((()))"));
        assertEquals(false, checkParenthesis(")("));
        assertEquals(true, checkParenthesis("()()()"));
        assertEquals(false, checkParenthesis("((())"));
        assertEquals(true, checkParenthesis("foo(bar(baz))"));
    }

    @Test
    fun testCeasarEncrypt() {
        assertEquals("Khoor!", caesarEncrypt("Hello!", 3));
        assertEquals("Lipps!", caesarEncrypt("Hello!", 4));
        assertEquals("Ebiil!", caesarEncrypt("Hello!", -3));
        assertEquals("Yza", caesarEncrypt("Abc", -2));
        assertEquals("Olccb", caesarEncrypt("Lizzy", 3));
    }
}

