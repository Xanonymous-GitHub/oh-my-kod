package math

fun <T> swap(array: Array<T>, i: Int, j: Int) {
    array[i] = array[j].also { array[j] = array[i] }
}

fun permutation(charArray: Array<Char>, i: Int = 0, length: Int) {
    if (i == length) {
        println(charArray.joinToString(" "))
    } else {
        for (j in i until length) {
            swap(charArray, i, j)
            permutation(charArray, i + 1, length)
            swap(charArray, j, i)
        }
    }
}
