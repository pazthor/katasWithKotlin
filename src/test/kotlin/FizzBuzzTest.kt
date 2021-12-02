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

//    test('-------- Component: returning the fifth element...', (assert)
    @Test
    fun testFizzbuzzYellowBeltThird() {
        val message = "The fifth element must be \"Buzz\" because 5 is divisible by 5."
        val expected = "Buzz"
        val result = yellowBelt()
        val actual = result[4]
        assertEquals(expected, actual, message)
    }

    @Test
    fun testFizzbuzzYellowBeltForth() {
        val message = "The 15th element must be \"FizzBuzz\" because 15 is divisible by 3 and 5."
        val expected = "FizzBuzz"
        val result = yellowBelt()
        val actual = result[14]
        assertEquals(expected, actual, message)
    }

//   TODO: fix test and refactor
//    test('-------- Component: returning a list of the first 15th values...', (assert) => {
//    @Test
//    fun testFizzbuzzYellowBeltFith(){
//        val message = "Some value doesn\\'t match"
//        val expected =  [1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7, 8, 'Fizz', 'Buzz', 11, 'Fizz', 13, 14, 'FizzBuzz']
//        val result = yellowBelt()
//        val actual =  result.list(0, 14);
//        assertEquals(expected, actual, message)
//
//    }
}
