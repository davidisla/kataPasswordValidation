class PasswordPattern {
    companion object {
        fun validation(password: String): Boolean {
            if( password.length < 9 )
                return false

            if( password.count { it.isUpperCase() } == 0 )
                return false

            if( password.count { it.isLowerCase() } == 0 )
                return false

            return true
        }
    }

}
