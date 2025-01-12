package uebung_1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class uebung_1Test {

    @Test
    fun testIsBigger() {
//        assertEquals(, isBiggerThenConstant(5))
//        assertEquals(, isBiggerThenConstant(6))
//        assertEquals(, isBiggerThenConstant(2))
//        assertEquals(, isBiggerThenConstant(-5))
//        assertEquals(, isBiggerThenConstant(100))
    }
























    @Test
    fun testSquare() {
//        assertEquals(, square(5))
//        assertEquals(, square(6))
//        assertEquals(, square(2))
//        assertEquals(, square(-5))
//        assertEquals(, square(100))
//        assertEquals(, square(0))
    }

























    @Test
    fun testMax() {
//        assertEquals(, max(5, 10))
//        assertEquals(, max(6, 25))
//        assertEquals(, max(2, -5))
//        assertEquals(, max(-5, 0))
//        assertEquals(, max(100, 100))
//        assertEquals(, max(0, -100))
//        assertEquals(, max(-99, -100))
    }
























    @Test
    fun testAbs() {
//        assertEquals(, abs(5))
//        assertEquals(, abs(-6))
//        assertEquals(, abs(2))
//        assertEquals(, abs(-5))
//        assertEquals(, abs(100))
//        assertEquals(, abs(0))
    }









































    @Test
    fun testModulo() {
//        assertEquals(, modulo(5, 10))
//        assertEquals(, modulo(25, 6))
//        assertEquals(, modulo(2, 5))
//        assertEquals(, modulo(5, 1))
//        assertEquals(, modulo(100, 100))
//        assertEquals(, modulo(0, 20))
//        assertEquals(, modulo(100, 24))
    }





























    @Test
    fun testFactorialRecursive() {
        assertEquals(1, factorialRecursive(0))
        assertEquals(1, factorialRecursive(1))
        assertEquals(2, factorialRecursive(2))
        assertEquals(6, factorialRecursive(3))
        assertEquals(24, factorialRecursive(4))
        assertEquals(120, factorialRecursive(5))
        assertEquals(720, factorialRecursive(6))
        assertEquals(5_040, factorialRecursive(7))
        assertEquals(40_320, factorialRecursive(8))
        assertEquals(362_880, factorialRecursive(9))
        assertEquals(3_628_800, factorialRecursive(10))
        assertEquals(39_916_800, factorialRecursive(11))
        assertEquals(479_001_600, factorialRecursive(12))
    }

    @Test
    fun testFactorialRecursiveOverflow() {
        assertEquals(6_227_020_800, factorialRecursive(13)) // Int Max Value: 2_147_483_647 (Long: 9_223_372_036_854_775_807)
        assertEquals(87_178_291_200, factorialRecursive(14)) // Int Max Value: 2_147_483_647 (Long: 9_223_372_036_854_775_807)
    }

    @Test
    fun testFactorialIterative() {
        assertEquals(1, factorialIterative(0))
        assertEquals(1, factorialIterative(1))
        assertEquals(2, factorialIterative(2))
        assertEquals(6, factorialIterative(3))
        assertEquals(24, factorialIterative(4))
        assertEquals(120, factorialIterative(5))
        assertEquals(720, factorialIterative(6))
        assertEquals(5_040, factorialIterative(7))
        assertEquals(40_320, factorialIterative(8))
        assertEquals(362_880, factorialIterative(9))
        assertEquals(3_628_800, factorialIterative(10))
        assertEquals(39_916_800, factorialIterative(11))
        assertEquals(479_001_600, factorialIterative(12))
    }

    @Test
    fun testFactorialIterativeOverflow() {
        assertEquals(6_227_020_800, factorialIterative(13)) // Int Max Value: 2_147_483_647 (Long: 9_223_372_036_854_775_807)
        assertEquals(87_178_291_200, factorialIterative(14)) // Int Max Value: 2_147_483_647 (Long: 9_223_372_036_854_775_807)
    }


















    @Test
    fun testDegreeIntersection() {
        assertEquals("(3.0, 11.0)", calculateIntersection(a1 = 3.0, 2.0, 2.0 , 5.0))
        assertEquals("(1.0, 3.0)", calculateIntersection(1.0, 2.0, -1.0, 4.0))
        assertEquals("(-3.3333333333333335, -3.666666666666667)", calculateIntersection(2.0, 3.0, -1.0, -7.0))

        assertEquals("(0.0, 2.0)", calculateIntersection(1.0, 2.0, -1.0, 2.0))  // Schnittpunkt auf der y-Achse
        assertEquals("(2.0, 0.0)", calculateIntersection(0.5, -1.0, -0.5, 1.0)) // Schnittpunkt auf der x-Achse
        assertEquals("(-1.0, -1.0)", calculateIntersection(1.0, 0.0, -1.0, -2.0)) // Schnittpunkt mit negativen Werten


        // Parallel und kein Schnittpunkt
        assertEquals("Die Geraden sind parallel und schneiden sich nicht.", calculateIntersection(2.0, 3.0, 2.0, 5.0))
        assertEquals("Die Geraden sind parallel und schneiden sich nicht.", calculateIntersection(0.0, 1.0, 0.0, -1.0))
        assertEquals("Die Geraden sind parallel und schneiden sich nicht.", calculateIntersection(-1.0, 3.0, -1.0, 1.0))


        // Identische GeradenÏ
        assertEquals("Die Geraden sind identisch (unendlich viele Schnittpunkte).", calculateIntersection(1.0, 2.0, 1.0, 2.0))
        assertEquals("Die Geraden sind identisch (unendlich viele Schnittpunkte).", calculateIntersection(0.0, 1.0, 0.0, 1.0))
        assertEquals("Die Geraden sind identisch (unendlich viele Schnittpunkte).", calculateIntersection(2.0, -5.0, 2.0, -5.0))
    }
}

