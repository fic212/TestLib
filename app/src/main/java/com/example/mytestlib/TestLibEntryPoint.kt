package com.example.mytestlib

class TestLibEntryPoint {

    private val internalDep = TestLibInternal()

    fun tryMe(string: String): Int {
        return internalDep.youDontSeeMe()
    }
}
