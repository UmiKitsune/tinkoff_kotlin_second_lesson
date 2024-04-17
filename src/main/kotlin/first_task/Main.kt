package first_task

import first_task.pet_from_first_hw.cat_family.Cat
import first_task.pet_from_first_hw.cat_family.Manul
import first_task.pet_from_first_hw.cat_family.Puma

fun main() {
    val q = Queue<Int>()

    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)

    val after = q.dequeue()

    println(after)
}

