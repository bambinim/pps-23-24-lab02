object Task2a extends App:

    val positiveLambda: Int => String = _ match
        case x if x >= 0 => "positive"
        case _ => "negative"

    println("Positive Lambda:")
    println(s"0: ${positiveLambda(0)}")
    println(s"1: ${positiveLambda(1)}")
    println(s"-1: ${positiveLambda(-1)}")

    def positiveMethod(x: Int): String =
        x match
            case x if x >= 0 => "positive"
            case _ => "negative"

    println("Positive Method:")
    println(s"0: ${positiveMethod(0)}")
    println(s"1: ${positiveMethod(1)}")
    println(s"-1: ${positiveMethod(-1)}")

    def neg[T](pred: T => Boolean): T => Boolean =
        !pred(_)

    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = neg(empty) // which type of notEmpty?
    println("Negative output:")
    println(notEmpty("foo")) // true
    println(notEmpty("")) // false
    println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
