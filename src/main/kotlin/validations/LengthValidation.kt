package validations

class LengthValidation(private val length: Int) : Validation {
    override fun invoke(pattern: String): Boolean =
        pattern.length < length
}