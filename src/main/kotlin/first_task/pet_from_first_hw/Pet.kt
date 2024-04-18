package first_task.pet_from_first_hw

abstract class Pet {
    abstract val sumSpeed: Int

    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
