package validations

interface Validation {

    /**
     * Interesting decision here.
     *
     * You can make a regular strategy approach and ends up using this interface
     * overriding a method with a name very similar to the interface, something
     * like this:
     *
     *      interface Validation
     *          fun validate(pattern: String): Boolean
     *
     *      class validations.LengthValidation(val length: Int): Validation
     *
     *      val lengthValidation = validations.LengthValidation(16)
     *
     *      val isValid = lengthValidation.validate(password)
     *
     * To avoid this, I've decided to override the `invoke` operator, looking
     * for this:
     *
     *      val lengthValidation = validations.LengthValidation(16)
     *
     *      val isValid = lengthValidation(password)
     *
     */
    operator fun invoke(pattern: String): Boolean
}