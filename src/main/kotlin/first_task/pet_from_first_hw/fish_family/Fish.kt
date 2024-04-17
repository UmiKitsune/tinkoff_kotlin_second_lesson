package first_task.pet_from_first_hw.fish_family

import first_task.pet_from_first_hw.Pet
import first_task.pet_from_first_hw.interfaces.Swimmable


open class Fish: Pet(), Swimmable {
    override val swimSpeed: Int = 30
    override val sumSpeed: Int
        get() {
            return swimSpeed
        }

    override fun swim() {
        println("I am ${this.javaClass.simpleName}, and i swimming")
    }

}