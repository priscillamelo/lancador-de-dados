package com.example.lancadordedados

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dado = Dado(6)
        val resultNumber = dado.roll()

        assertTrue("O valor de resultNumber não foi entre 1 e 6", resultNumber in 1..6)
    }
}