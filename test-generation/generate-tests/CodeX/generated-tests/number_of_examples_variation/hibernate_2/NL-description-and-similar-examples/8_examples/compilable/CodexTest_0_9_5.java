import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
  public void testFromString() throws Exception {
	String trueString = "true";
	Boolean trueBoolean = Boolean.TRUE;
	
	String falseString = "false";
	Boolean falseBoolean = Boolean.FALSE;
	
	assertEquals( "\nReturned value did not match expected: ", trueString, trueBoolean.toString() );
	assertEquals( "\nReturned value did not match expected: ", falseString, falseBoolean.toString() );
	assertFalse( "\nReturned value did not match expected: ", trueString.equals( falseString ) );
	assertTrue( "\nReturned value did not match expected: ", falseString.equals( falseString ) );
}
}