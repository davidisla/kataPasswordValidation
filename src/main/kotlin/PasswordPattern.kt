class PasswordPattern {

    companion object {
        fun validation(password: String): Boolean {

            val validations = listOf( LengthValidation(),
                UppercaseValidation(),
                LowercaseValidation(),
                DigitValidation(),
                UnderscoreValidation()
            )

            validations.forEach {
                if( it(password) )
                    return false
            }

            return true
        }
    }

}
