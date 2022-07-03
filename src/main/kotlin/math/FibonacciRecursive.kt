package math

fun fibRecursive(number: Int): Int {
    return when (number) {
        0, 1 -> number
        else -> fibRecursive(number - 2) + fibRecursive(number - 1)
    }
}
