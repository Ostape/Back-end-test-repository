package com.robosh.calculator

import junit.framework.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    private val subject = Calculator()

    @Test
    fun `sum should return 20`() {
        val result = subject.sum(10, 10)
        assertEquals(result, 25)
    }

    @Test
    fun `sum should return 10`() {
        val result = subject.sum(5, 5)
        assertEquals(result, 10)
    }

    @Test
    fun `sum should return 0`() {
        val result = subject.sum(1, -1)
        assertEquals(result, 0)
    }

    @Test
    fun `sum should return -20`() {
        val result = subject.sum(-10, -10)
        assertEquals(result, -20)
    }
}