      case (n, _) if n <= 2 => n == 2
        case (n, i) if n % i == 0 => false
        case (n, i) if i * i > n => true
        case (n, i) => prime(n, i + 1)