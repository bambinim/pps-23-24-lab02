object Task3 extends App:

    @annotation.tailrec
    def gcd(a: Int, b: Int): Int =
        b match
            case x if x == 0 => a
            case _ => gcd(b, a % b)

    println(s"gcd(12, 8) = ${gcd(12, 8)}")
    println(s"gcd(14, 7) = ${gcd(14, 7)}")
