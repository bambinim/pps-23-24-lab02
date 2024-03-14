object Task2b extends App:
    val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

    val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

    def p3(x: Int)(y: Int)(z: Int): Boolean =
        x <= y && y == z

    def p4(x: Int, y: Int, z: Int): Boolean =
        x <= y && y == z

    def compose[T](f: T => T, g: T => T): T => T =
        (x: T) => f(g(x))
    
    println(s"compose(_ - 1, _ * 2)(5) = ${compose[Int](_ - 1, _ * 2)(5)}")
