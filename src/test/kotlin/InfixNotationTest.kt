import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class InfixNotationTest {

    @Test
    fun `test infix notation as extension function`() {
        val subject = "This is a String"

        assertTrue { subject isInstanceOf String::class }
    }
}