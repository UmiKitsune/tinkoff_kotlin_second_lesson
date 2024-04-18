package first_task


import first_task.pet_from_first_hw.Pet
import first_task.pet_from_first_hw.interfaces.Swimmable
import java.util.LinkedList


class MyQueue<T> : Iterable<T> where T: Pet, T: Swimmable {
    private val queue: LinkedList<T> = LinkedList<T>()

    override fun iterator(): Iterator<T> {
        return queue.iterator()
    }

    fun add(element: T) {
        queue.addLast(element)
    }

    fun remove(): T {
        return queue.removeFirst()
    }

    fun element(): T {
        return queue.first()
    }

    //null safety

    fun poll(): T? {
        return queue.removeFirstOrNull()
    }

    fun peek(): T? {
        return queue.firstOrNull()
    }

}
