package matrixsystems.unittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.hamcrest.CoreMatchers.*

/**
 * Created by Shahbaz Hashmi on 2020-01-22.
 */
class ValidatorUtilsTest {

    lateinit var SUT : ValidatorUtils

    @Before
    fun setUp() {
        SUT = ValidatorUtils()
    }

    @Test
    fun validate_indianNumber_true() {
        val result = SUT.isValidMobile("9876543210")
        assertThat(result, `is`(true))
    }
}