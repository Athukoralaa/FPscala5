object q6 extends App{
    def printFibonacci(n: Int): Unit = {
    def fibonacci(num: Int): Int = {
        if (num <= 1) {
        num
        } else {
        fibonacci(num - 1) + fibonacci(num - 2)
        }
    }

    for (i <- 0 until n) {
        print(fibonacci(i) + " ")
    }
    }
    

// Test
        printFibonacci(10)
}