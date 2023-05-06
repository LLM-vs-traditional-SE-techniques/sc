import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_71 { 
  @Test
    public void testParseBooleanTrue() {
        assertTrue(BooleanUtils.toBoolean("true"));
    }
    
	public void testParseBooleanFalse() {
        assertFalse(BooleanUtils.toBoolean("false"));
    }
    
	public void testParseBooleanYes() {
        assertTrue(BooleanUtils.toBoolean("yes"));
    }
    
	public void testParseBooleanNo() {
        assertFalse(BooleanUtils.toBoolean("no"));
    }
    
	public void testParseBooleanY() {
        assertTrue(BooleanUtils.toBoolean("y"));
    }
    
	public void testParseBooleanN() {
        assertFalse(BooleanUtils.toBoolean("n"));
    }
    
	public void testParseBooleanOne() {
        assertTrue(BooleanUtils.toBoolean("1"));
    }
    
	public void testParseBooleanZero() {
        assertFalse(BooleanUtils.toBoolean("0"));
    }
    
	public void testParseBooleanOn() {
        assertTrue(BooleanUtils.toBoolean("on"));
    }
    
	public void testParseBooleanOff() {
        assertFalse(BooleanUtils.toBoolean("off"));
    }
}