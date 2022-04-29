package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void tooManyOpenBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }

    @Test
    public void tooManyCloseBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]]"));
    }

    // * The string may contain non-bracket characters as well.
    @Test
    public void nonBracketChar(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("launchcode"));
    }

    //The string may contain non-bracket characters as well.
    @Test
    public void splitStringBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void misMatchReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch[]"));
    }

    @Test
    public void emptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void StringHasSpace(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[lau nchCode"));
    }
}
