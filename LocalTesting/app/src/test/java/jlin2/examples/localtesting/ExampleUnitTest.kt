package jlin2.examples.localtesting

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun email_isCorrect() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun email_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun email_Dots_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun email_empty_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun email_null_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun email_subdomain_isCorrect(){
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun email_noUsername_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun email_noDomain_isIncorrect(){
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }
    
}