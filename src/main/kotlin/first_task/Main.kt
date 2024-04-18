package first_task

import first_task.pet_from_first_hw.cat_family.Cat
import first_task.pet_from_first_hw.cat_family.Manul
import first_task.pet_from_first_hw.cat_family.Puma
import first_task.pet_from_first_hw.fish_family.Fish

fun main() {
    val catsList = MyQueue<Cat>()

    catsList.add(Puma())
    catsList.add(Puma())
    catsList.add(Manul())

    catsList.map { println("Add last in catList: $it") }
    println()

    catsList.remove()

    println("Remove first from catList:")
    catsList.map { println( it ) }
    println()

    println("Take first element without remove it:")
    println( catsList.element() )
    println()

    //Проверка на разницу безопасных и небезопасных методов
    val fishList = MyQueue<Fish>()

    try {
        fishList.remove()
    } catch (e: NoSuchElementException) {
        println("Поймали исключение: NoSuchElementException")
    }

    try {
        fishList.element()
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    println(fishList.poll())
    println(fishList.peek())

}

