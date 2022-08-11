package validations

class LowercaseValidation : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.count { it.isLowerCase() } == 0
}