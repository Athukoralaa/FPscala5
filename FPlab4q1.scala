object Main extends App {
  def prime(n: Int, i: Int = 2): Boolean = (n, i) match {
    case (n, _) if n <= 2 => n == 2
    case (n, i) if n % i == 0 => false
    case (n, i) if i * i > n => true
    case (n, i) => prime(n, i + 1)
  }

  println(prime(5))   // true
  println(prime(8))   // false
  println(prime(13))  // true
  println(prime(20))  // false
  println(prime(1))   // false
}
