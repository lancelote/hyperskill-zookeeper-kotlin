package stage4.hw14

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse

internal class MainKtTest {

    @Test
    fun leftDiagonal() {
        assertTrue(takes(1, 1, 3, 3))
    }

    @Test
    fun doesntTake() {
        assertFalse(takes(1, 1, 4, 3))
    }

    @Test
    fun vertical() {
        assertTrue(takes(2, 2, 5, 2))
    }
}
