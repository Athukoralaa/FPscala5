object q5 extends App{
    def sumEven(n: Int): Int = {
  if (n <= 0) {
    0
  } else {
    val current = if (n % 2 == 0) n else n - 1
    current + sumEven(current - 2)
  }
}
    println(sumEven(5))
}