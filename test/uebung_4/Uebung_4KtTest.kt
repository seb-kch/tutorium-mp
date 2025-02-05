package uebung_4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Uebung_4KtTest {
    @Test
    fun createRandomIntArrayTest() {
        assertEquals(IntArray(5).size, createRandomIntArray(5).size)
    }
























    @Test
    fun calcMeanTest() {
        assertEquals(2.0, calcMean(intArrayOf(1, 2, 3)))
        assertEquals(2.5, calcMean(intArrayOf(1, 2, 3, 4)))
        assertEquals(7.833333333333333, calcMean(intArrayOf(5, 5, 8, 20, 3, 6)))
        assertEquals(Double.NaN, calcMean(intArrayOf()))
    }















    @Test
    fun calcMedianTest() {
        assertEquals(2.0, calcMedian(intArrayOf(1, 2, 3)))
        assertEquals(2.5, calcMedian(intArrayOf(1, 2, 3, 4)))
        assertEquals(5.0, calcMedian(intArrayOf(3, 4, 5, 7, 8)))
        assertEquals(6.0, calcMedian(intArrayOf(3, 4, 5, 7, 8, 9)))
    }


















    @Test
    fun stdTest() {
        assertEquals(1.4142135623730951, std(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0.0, std(intArrayOf(10, 10, 10, 10, 10)))
        assertEquals(0.816496580927726, std(intArrayOf(1,2,3)))
        assertEquals(1.707825127659933, std(intArrayOf(4, 8, 6, 5, 3, 7)))
        assertEquals(81.64965809277261, std(intArrayOf(100,200,300)))
        assertEquals(0.0, std(intArrayOf(1)))
        assertEquals(0.0, std(intArrayOf()))
    }




















    @Test
    fun isSortedTest() {
        assertEquals(true, isAscendingSorted(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(true, isAscendingSorted(intArrayOf(1, 4, 5)))
        assertEquals(false, isAscendingSorted(intArrayOf(1, 5, 3)))
        assertEquals(false, isAscendingSorted(intArrayOf(5, 4, 3)))
        assertEquals(false, isAscendingSorted(intArrayOf(-1, -2, 3)))
        assertEquals(true, isAscendingSorted(intArrayOf(-2, 0, 3)))
        assertEquals(false, isAscendingSorted(intArrayOf(0, 0, 0, -1)))
        assertEquals(true, isAscendingSorted(intArrayOf(0, 0, 0, 1)))
        assertEquals(true, isAscendingSorted(intArrayOf(1)))
    }





















    @Test
    fun randomSwapSortTest() {
        for (i in 0 until 10) {
            val arr = createRandomIntArray(5)
            randomSwapSort(arr)
            val copyOfArr = arr.copyOf();
            copyOfArr.sort()
            assertEquals(arr.joinToString(","), copyOfArr.joinToString(","))
        }
    }
}