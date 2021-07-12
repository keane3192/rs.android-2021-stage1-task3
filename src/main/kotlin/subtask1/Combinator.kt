package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var i = array[0]
        val n = array[1]
        var k = 1
        while((factorial(k) * factorial(n-k)) != (factorial(n) / i)){
            k++
            if(k > n){
                return null
            }
        }
        return k
    }
    fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
}
