import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun testFizzbuzzYellowBelt() {
//        Resource: http://katayuno-app.herokuapp.com/katas/1
        val result = yellowBelt()
        val actual = result[0]
        val expected = "1"
        val message = "The first element must be 1 because is not divisible by 3 or 5."

        assertEquals(expected, actual, message)
    }

    @Test
    fun testFizzbuzzYellowBeltSecond() {
        val message = "The third element must be Fizz because 3 is divisible by 3."
        val expected = "Fizz"
        val result = yellowBelt()
        val actual = result[2]
        assertEquals(expected, actual, message)
    }
}
