package math

val Int.sumUpNumber: Int
    get() = when (this) {
        0 -> 0
        else -> this + (this@sumUpNumber - 1).sumUpNumber
    }
