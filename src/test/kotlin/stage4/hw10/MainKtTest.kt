package stage4.hw10

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class MainKtTest {

    @Test
    fun isRegular() {
        assertFalse(isLeap(2100))
    }

    @Test
    fun isLeap() {
        assertTrue(isLeap(2000))
    }
}
