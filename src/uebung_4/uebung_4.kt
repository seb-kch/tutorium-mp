package uebung_4

import kotlin.random.Random
import kotlin.time.Duration
import kotlin.time.measureTime

/**
 * Aufgabe 1
 */
fun createRandomIntArray(size: Int): IntArray {
    val ints = IntArray(size)
    for (i in ints.indices) ints[i] = Random.nextInt();
    return ints
}

fun main() {
    println(createRandomIntArray(-10).joinToString(", "))
}





















/**
 * Aufgabe 2
 */
fun sumThrowsWithTwoDice(numberOfSides: Int): IntArray {
    // 1,1; 1,2; 2,1; 2,2; 2,3; 3,2; 3,3; 3,4; 4,3; 4,4
    val arr = IntArray(numberOfSides * numberOfSides)
    var index = 0
    for (i in 1..numberOfSides)
        for (j in 1..numberOfSides) {
            arr[index] = i + j;
            index++;
        }
    arr.sort()
    return arr
}

//fun main() {
//    println(sumThrowsWithTwoDice(6).joinToString(", "))
//}
























/**
 * Aufgabe 3
 */
fun swap(array: IntArray, index1: Int, index2: Int) {
    val temp = array[index1];
    array[index1] = array[index2]
    array[index2] = temp
}






















/**
 * Aufgabe 4
 */
fun shuffle(array: IntArray, numberOfSwaps: Int) {
    for (swap in 0 until numberOfSwaps) {
        val i1 = Random.nextInt(array.size)
        val i2 = Random.nextInt(array.size)
        swap(array, i1, i2)
    }
}

//fun main() {
//    shuffle(intArrayOf(1,2,3,4,5,6), 3)
//}























/**
 * Aufgabe 5
 */
fun calcMean(a: IntArray): Double {
    return a.sum().div(a.size.toDouble())
}





















/**
 * Aufgabe 6
 */
fun calcMedian(a: IntArray): Double {
    if (a.isEmpty()) return 0.0
    a.sort()
    if (a.size % 2 != 0) {
        val middle = a.size / 2
        return a[middle].toDouble()
    }
    return (a[a.size / 2 - 1] + a[a.size / 2]).div(2.0)
}






















/**
 * Aufgabe 7
 *
 * Standardabweichung berechnen
 *
 * https://de.khanacademy.org/math/statistics-probability/summarizing-quantitative-data/variance-standard-deviation-sample/a/population-and-sample-standard-deviation-review
 */
fun std(a: IntArray): Double {
    if (a.isEmpty()) return 0.0
    val mean: Double = calcMean(a);
    var summeAbweichung = 0.0
    for (n in a) {
        summeAbweichung += Math.pow(n - mean, 2.0)
    }
    return Math.sqrt(summeAbweichung.div(a.size))
}



















/**
 * Aufgabe 8
 */
fun isAscendingSorted(a: IntArray): Boolean {
    for (i in 0 until a.size - 1) {
        if (a[i] > a[i + 1]) return false
    }
    return true
}


























/**
 * Aufgabe 9
 */
fun sortTwoRandomIndices(a: IntArray): Unit {
    val i1 = Random.nextInt(a.size)
    val i2 = Random.nextInt(a.size)
    if ((i1 < i2 && a[i1] > a[i2]) || (i2 < i1) && a[i2] > a[i1]) {
        swap(a, i1, i2)
    }
}

//fun main() {
//    sortTwoRandomIndices(intArrayOf(1))
//}


























/**
 * Aufgabe 10
 */
fun randomSwapSort(a: IntArray) {
    while (!isAscendingSorted(a)) {
        sortTwoRandomIndices(a)
    }
}


//fun main() {
//    val arr = createRandomIntArray(5)
//    randomSwapSort(arr)
//    println(arr.joinToString(", "))
//}













//fun benchmarkRandomSwapSort(arraySizes: IntArray): LongArray {
//    val benchmarkTimes = LongArray(arraySizes.size)
//    for (idx in arraySizes.indices) {
//        val arr = createRandomIntArray(arraySizes[idx])
//        val time: Duration = measureTime {
//            randomSwapSort(arr)
//        }
//        benchmarkTimes[idx] = time.inWholeMilliseconds
//    }
//    return benchmarkTimes
//}















/**
 * Aufgabe 11
 */
fun benchmarkRandomSwapSort(arraySizes: IntArray): LongArray {
    val benchmarkTimes = LongArray(arraySizes.size)
    for (i in arraySizes.indices) {
        val arr = createRandomIntArray(arraySizes[i])
        val elapsedTime = measureTime {
            randomSwapSort(arr)
        }
        benchmarkTimes[i] = elapsedTime.inWholeMilliseconds
    }
    return benchmarkTimes
}

//fun main() {
//    println(
//        benchmarkRandomSwapSort(
//            intArrayOf(
//                1,
//                2,
//                3,
//                4,
//                5,
//                6,
//                7,
//                8,
//                9,
//                10,
//                11,
//                12,
//                13,
//                14,
//                15,
//                16,
//                17,
//                18,
//                19,
//                20,
//                30,
//                60,
//                120,
//                200,
//                500,
//                6000
//            )
//        ).joinToString(", ")
//    )
//    // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 4, 33, 104003
//}