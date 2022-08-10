import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class PasswordValidationTest {

    @Nested
    inner class InvalidPasswords {

        @Test
        fun `should have more than 8 characters`() {
            assertFalse( PasswordPattern.validation("Ab1_") )
        }
    }
}