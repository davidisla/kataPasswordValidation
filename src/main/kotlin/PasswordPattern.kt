class PasswordPattern {
    companion object {
        fun validation(password: String): Boolean {
            if( password.length < 9 )
                return false

            return true
        }
    }

}
