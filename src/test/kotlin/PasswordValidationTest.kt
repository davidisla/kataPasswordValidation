import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class PasswordValidationTest {
    fun List<String>.without(value: String) = filter { it != value }
    fun List<String>.join() = joinToString(separator = "")

    val NEUTRAL = "/"
    val UPPERCASE = "A"
    val LOWERCASE = "b"
    val UNDERSCORE = "_"
    val NUMBER = "1"
    val FILLER4 = NEUTRAL.repeat(4)
    val FILLER8 = NEUTRAL.repeat(8)

    val validPassword = mutableListOf(UPPERCASE, LOWERCASE, NUMBER, UNDERSCORE, FILLER8)

    val PWD_4_CHARACTERS = validPassword.without(FILLER8).join()
    val PWD_8_CHARACTERS = validPassword.without(FILLER8).plus(FILLER4).join()
    val PWD_WITHOUT_UPPERCASE = validPassword.without(UPPERCASE).join()
    val PWD_WITHOUT_LOWERCASE = validPassword.without(LOWERCASE).join()
    val PWD_WITHOUT_NUMBER = validPassword.without(NUMBER).join()
    val PWD_WITHOUT_UNDERSCORE = validPassword.without(UNDERSCORE).join()

    @Nested
    inner class InvalidPasswords {

        @Test
        fun `should have more than 8 characters`() {
            assertFalse(PasswordPattern.validation(PWD_4_CHARACTERS))
            assertFalse(PasswordPattern.validation(PWD_8_CHARACTERS))
        }

        @Test
        fun `should have a capital letter`() {
            assertFalse(PasswordPattern.validation(PWD_WITHOUT_UPPERCASE))
        }

        @Test
        fun `should have a lowercase letter`() {
            assertFalse(PasswordPattern.validation(PWD_WITHOUT_LOWERCASE))
        }

        @Test
        fun `should have a number`() {
            assertFalse(PasswordPattern.validation(PWD_WITHOUT_NUMBER))
        }

        @Test
        fun `should have an underscore`() {
            assertFalse(PasswordPattern.validation(PWD_WITHOUT_UNDERSCORE))
        }
    }

}