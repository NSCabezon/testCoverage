package com.example.yetanothertestcoverageproject

import org.junit.Assert
import org.junit.Test

class AccountTest {
    val acct: Account = Account("coso", "ES23498762349823")

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(acct.fullDetail(), "cosoES23498762349823")
    }
}