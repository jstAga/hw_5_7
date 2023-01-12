package com.geektech.hw_5_7

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest  {
    var math: Math? = null


    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleTest() {
        assertEquals("4.0", math?.sum("2", "2"))
    }

    @Test
    fun letterTest() {
        assertEquals("Вы ввели буквы", math?.sum("a", "2"))
    }

    @Test
    fun symbolTest() {
        assertEquals("Вы ввели буквы", math?.sum("@££$%^%)%£", "2"))
    }

    @Test
    fun doubleTest(){
        assertEquals("4.0",math?.sum("2.0","2.0"))
    }
    @Test
    fun emptyTest(){
        assertEquals("Вы не заполнили поля",math?.sum("","2.0"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("2.0",math?.divide("4.0","2.0"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("Нельзя делить",math?.divide("4.0","0.0"))
    }

    @Test
    fun spaseTest() {
        assertEquals("Вы поставили пробел",math?.divide(" ","2.0"))
    }
    @After
    fun detach() {
        math = null
    }
}