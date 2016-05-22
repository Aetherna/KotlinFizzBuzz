package com.aethernadev.fizzbuzzwhaaazaa

import com.google.common.truth.Truth
import com.google.common.truth.Truth.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by Aetherna on 2016-05-20.
 */
class FizzBuzzTest {

    var underTest: FizzBuzz? = null;

    @Before
    fun setUp() {
        underTest = FizzBuzz();
    }

    @Test
    fun shouldReturnNumberWhenNoRule() {
        //having
        var input: Int = 1111;

        //when
        var result = underTest?.processInput(input)

        //then
        var expected = "1111"
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun shouldReturnFizzOnDivideBy3(){
        //having
        var input = 12
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "Fizz"
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun shouldReturnBuzzOnDivideBy5(){
        //having
        var input = 10
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "Buzz"
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun shouldReturnFizzBuzzOnDivideBy5And3(){
        //having
        var input = 15
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "FizzBuzz"
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun shouldReturnFizzOnContain3(){
        //having
        var input = 13
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "Fizz"
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun shouldReturnBuzzOnContain5(){
        //having
        var input = 52
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "Buzz"
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun shouldReturnBuzzOnContain3And5(){
        //having
        var input = 351
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "FizzBuzz"
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun shouldReturnBuzzOnDivide3And5(){
        //having
        var input = 15
        //when
        var result = underTest?.processInput(input)
        //then
        var expected = "FizzBuzz"
        assertThat(result).isEqualTo(expected)
    }
}