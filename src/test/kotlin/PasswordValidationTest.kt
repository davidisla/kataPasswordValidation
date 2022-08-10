import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class PasswordValidationTest {

    val NEUTRAL = "/"
    val UPPERCASE = "A"
    val LOWERCASE = "b"
    val UNDERSCORE = "_"
    val NUMBER = "1"

    val PWD_4_CHARACTERS = UPPERCASE + LOWERCASE + NUMBER + UNDERSCORE
    val PWD_8_CHARACTERS = UPPERCASE + LOWERCASE + NUMBER + UNDERSCORE + NEUTRAL.repeat(4)
    val PWD_WITHOUT_UPPERCASE = NEUTRAL + LOWERCASE + NUMBER + UNDERSCORE + NEUTRAL.repeat(5)

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
    }

}