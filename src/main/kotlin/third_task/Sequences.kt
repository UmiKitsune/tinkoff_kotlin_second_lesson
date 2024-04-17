package third_task

import kotlin.math.pow
import kotlin.math.round

fun main() {
    val firstList = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    val secondList = listOf(133.21, null, 233.98, null, 26.99, 5.0, 7.0, 9.0)

    println(sequence(firstList))
    println(sequence(secondList))
}

fun sequence(list: List<Double?>): Double {

    val notNullList = list.filterNotNull()

    val odd = notNullList
        .asSequence()
        .filter { it.toInt() % 2 != 0 }
        .map { it / 2 }
        .filter { it <= 25.0 }
        .toList()

    val even = notNullList
        .asSequence()
        .filter { it.toInt() % 2 == 0 }
        .map { it.pow(2) }
        .filter { it <= 25.0 } //todo: когда заменят примеры проверить нужно ли = и заменить в ридми если надо
        .toList()

    val wholeList = odd + even

    val sum = wholeList
        .asSequence()
        .sortedByDescending { it }
        .take(10)
        .sum()

    //val a = "%.2f".format(sum).replace(',', '.')
    //println(a.toDouble()) - решение если нужно точно 2 знака после . + возможно нужна проверка если там ,?

    return round(sum * 100) / 100
}