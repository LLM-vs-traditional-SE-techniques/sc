import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_41 { 
  @Test
      public void testFromString() {
    	  assertTrue(new BooleanType().fromString("true"));
    	  assertTrue(new BooleanType().fromString("t"));
    	  assertTrue(new BooleanType().fromString("yes"));
    	  assertTrue(new BooleanType().fromString("y"));
    	  assertTrue(new BooleanType().fromString("1"));
}