package com.aethernadev.fizzbuzzwhaaazaa

/**
 * Created by Aetherna on 2016-05-23.
 */

class Rule(var lambda: (Int) -> Boolean, var output: String) {

    fun isValid(input: Int): Boolean{
       return lambda.invoke(input)
    }
}