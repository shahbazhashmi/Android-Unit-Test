package matrixsystems.unittest

import java.util.regex.Pattern

/**
 * Created by Shahbaz Hashmi on 2020-01-22.
 */
class ValidatorUtils {

    fun isValidMobile(phone: String): Boolean {
        return if (!Pattern.matches("[a-zA-Z]+", phone)) {
            phone.length > 6 && phone.length <= 13
        } else false
    }

}