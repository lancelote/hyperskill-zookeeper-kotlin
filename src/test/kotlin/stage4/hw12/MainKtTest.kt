package stage4.hw12

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse

internal class MainKtTest {

    @Test
    fun isBeat() {
        assertTrue(isBeat(1, 1, 2, 3))
        assertTrue(isBeat(4, 3, 3, 5))
    }

    @Test
    fun isNotBeat() {
        assertFalse(isBeat(1, 1, 2, 2))
        assertFalse(isBeat(1, 1, 1, 4))
    }
}
