package second_task

fun main() {
    println(calculator(plus, 1.0, 1.0))
    println(calculator(signOperation("+"), 1.0, -1.0))

    println(calculator(minus, 2.0, 1.0))
    println(calculator(signOperation("-"), 2.0, -1.0))

    println(calculator(multi, 2.0, 2.0))
    println(calculator(signOperation("*"), 2.0, -2.0))

    println(calculator(div, 3.0, 2.0))
    println(calculator(signOperation("/"), 2.0, -4.0))

    try {
        println(calculator(div, 3.0, 0.0))
    } catch (e:ArithmeticException) {
        println("На ноль делить нельзя")
    }

    try {
        println(calculator(signOperation("="), 1.0, 1.0))
    } catch (e:UnsupportedOperationException) {
        println("Неизвестная операция")
    }
}


val calculator: (
    operation: (Double, Double) -> Double,
    leftOperand: Double,
    rightOperand: Double
) -> Double = { operation, left, right ->
    operation(left, right)
}


val signOperation: (operation: String) -> (Double, Double) -> Double = { operation ->
    when (operation) {
        "+" -> plus
        "-" -> minus
        "*" -> multi
        "/" -> div
        else -> throw UnsupportedOperationException()
    }
}

val plus: (Double, Double) -> Double = { leftOperand, rightOperand ->
    leftOperand + rightOperand
}

val minus: (Double, Double) -> Double = { leftOperand, rightOperand ->
    leftOperand - rightOperand
}

val multi: (Double, Double) -> Double = { leftOperand, rightOperand ->
    leftOperand * rightOperand
}

val div: (Double, Double) -> Double = { leftOperand, rightOperand ->
    if (rightOperand == 0.0) throw ArithmeticException()
    else leftOperand / rightOperand
}







