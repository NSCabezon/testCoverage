package com.example.yetanothertestcoverageproject

class Account(val name: String, val accountNumber: String) {

    fun fullDetail(): String {
        return name + accountNumber
    }

    fun fullDetail2(): String {
        return name + accountNumber
    }
}