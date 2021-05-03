
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class InfixNotationTest {

    @Test
    fun `test infix notation as extension function`() {
        val subject = "This is a String"

        assertTrue { subject isInstanceOf String::class }
    }

    @Test
    fun `test infix notation as member function`() {
        val queue = Queue<String>()
        val expected = "First!"

        // This is utilizing the infix notation
        queue enqueue "First!"
        queue enqueue "Second!"
        queue enqueue "Third!"

        assertEquals(expected, queue.dequeue())
    }
}