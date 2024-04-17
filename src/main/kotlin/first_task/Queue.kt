package first_task

import first_task.pet_from_first_hw.Pet
import first_task.pet_from_first_hw.interfaces.Swimmable
import java.util.ArrayDeque

//where T: Pet, T: Swimmable
class Queue<T>  {
    private val queue = ArrayDeque<T>()

    fun enqueue(element: T) {
        queue.addLast(element)
    }

    fun dequeue(): T {
        return queue.removeFirst()
    }

    //todo: добавить, удалить + тоже самое только безопасно, проверить наличие элемента
}
