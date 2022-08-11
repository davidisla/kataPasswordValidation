class DigitValidation : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.count { it.isDigit() } == 0
}