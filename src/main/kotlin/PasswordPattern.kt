class PasswordPattern private constructor(private val validations: List<Validation>) {

    data class Builder(
        var minimumLength: Int = 0,
        var withUppercase: Boolean = false,
        var withLowercase: Boolean = false,
        var withDigit: Boolean = false,
        var withUnderscore: Boolean = false ) {

        fun withMinimumLength(minimum: Int) = apply { minimumLength = minimum }
        fun withUppercase() = apply { withUppercase = true }
        fun withLowercase() = apply { withLowercase = true }
        fun withDigit() = apply { withDigit = true }
        fun withUnderscore() = apply { withUnderscore = true }

        fun build(): PasswordPattern {
            val validations = mutableListOf<Validation>()

            if (minimumLength > 0) validations.add(LengthValidation(minimumLength))
            if (withUppercase) validations.add(UppercaseValidation())
            if (withLowercase) validations.add(LowercaseValidation())
            if (withDigit) validations.add(DigitValidation())
            if (withUnderscore) validations.add(UnderscoreValidation())

            return PasswordPattern(validations)
        }
    }

    fun validate(password: String): Boolean {
        validations.forEach {
            if (it(password))
                return false
        }

        return true
    }

}
