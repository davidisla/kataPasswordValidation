class LengthValidation : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.length < 9
}