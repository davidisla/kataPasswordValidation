class UppercaseValidation : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.count { it.isUpperCase() } == 0
}