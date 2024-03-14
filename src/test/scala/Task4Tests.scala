import org.junit.*
import org.junit.Assert.*
import Task4.Shape

class Task4Tests:

    val rectangle = Shape.Rectangle(2, 4)
    val circle = Shape.Circle(2)
    val square = Shape.Square(5)

    @Test def testPerimeter(): Unit =
        assertEquals(12.0, Shape.perimeter(rectangle), 0)
        assertEquals(2 * Math.PI * 2, Shape.perimeter(circle), 0.1)
        assertEquals(20, Shape.perimeter(square), 0)

    @Test def testScale(): Unit =
        assertEquals(Shape.Rectangle(4, 8), Shape.scale(rectangle, 2))
        assertEquals(Shape.Circle(6), Shape.scale(circle, 3))
        assertEquals(Shape.Square(20), Shape.scale(square, 4))
