class UnderscoreValidation : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.count { it == '_' } == 0
}