package com.aethernadev.fizzbuzzwhaaazaa

/**
 * Created by Aetherna on 2016-05-20.
 */
class FizzBuzz {

    var fizzRule = { input: Int -> input % 3 == 0 || input.toString().contains('3')}
    var buzzRule = { input: Int -> input % 5 == 0 || input.toString().contains('5')}
    var fizzBuzzRule = { input: Int -> fizzRule.invoke(input) && buzzRule.invoke(input) }

    val rules: Array<Rule> = arrayOf(
            Rule(fizzBuzzRule, "FizzBuzz"),
            Rule(fizzRule, "Fizz"),
            Rule(buzzRule, "Buzz")
    )

    fun processInput(input: Int): String? {

        var validRule = rules
                .filter { it.isValid(input) }
                .firstOrNull()

        return if (validRule == null) {
            Integer.toString(input);
        } else {
            validRule.output;
        }
    }
}
