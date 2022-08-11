class PasswordPattern {

    companion object {
        fun validation(password: String): Boolean {
            if (checkLength(password))
                return false

            if (checkUppercase(password))
                return false

            if (checkLowercase(password))
                return false

            if (checkDigit(password))
                return false

            if (checkUnderscore(password))
                return false

            return true
        }

        private fun checkUnderscore(password: String) = password.count { it == '_' } == 0

        private fun checkDigit(password: String) = password.count { it.isDigit() } == 0

        private fun checkLowercase(password: String) = password.count { it.isLowerCase() } == 0

        private fun checkUppercase(password: String) = password.count { it.isUpperCase() } == 0

        private fun checkLength(password: String) = password.length < 9
    }

}
