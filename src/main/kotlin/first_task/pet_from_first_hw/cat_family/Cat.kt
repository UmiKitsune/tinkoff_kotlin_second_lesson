package first_task.pet_from_first_hw.cat_family

import first_task.pet_from_first_hw.Pet
import first_task.pet_from_first_hw.interfaces.Swimmable
import first_task.pet_from_first_hw.interfaces.Runnable


open class Cat() : Pet(), Runnable, Swimmable {
    override val runSpeed: Int = 20
    override val swimSpeed: Int = 20
    override val sumSpeed: Int
        get() {
            return runSpeed + swimSpeed
        }

    override fun run() {
        println("I am ${this.javaClass.simpleName} and i running")
    }

    override fun swim() {
        println("I am ${this.javaClass.simpleName} and i swimming")
    }
}