package math

fun fibIterative(number: Int): Int {
    return (2 until number).fold(1 to 1) { (prev, curr), _ ->
        curr to (prev + curr)
    }.second
}
