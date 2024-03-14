object Task4 extends App:

    enum Shape:
        case Rectangle(side1: Double, side2: Double)
        case Circle(radius: Double)
        case Square(side: Double)

    object Shape:
        def perimeter(shape: Shape): Double =
            shape match
                case Rectangle(side1, side2) => 2 * side1 + 2 * side2
                case Circle(radius) => 2 * Math.PI * radius
                case Square(side) => 4 * side
        
        def scale(shape: Shape, alpha: Double): Shape =
            shape match
                case Rectangle(side1, side2) => Rectangle(side1 * alpha, side2 * alpha)
                case Circle(radius) => Circle(radius * alpha)
                case Square(side) => Square(side * alpha)
