import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
        public void testBooleanParser() {
		String[] testStrings = new String[] {
			"true", "True", "tRUE", "false", "False", "fALSe",
			"t", "T", "f", "F"
		  };
		  Boolean[] correctValues = new Boolean[] {
			Boolean.TRUE, Boolean.TRUE, Boolean.TRUE,
			Boolean.FALSE, Boolean.FALSE, Boolean.FALSE,
			Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE
		   };
		   for (int i = 0; i < testStrings.length; i++)
			   assertEquals(correctValues[i], Boolean.valueOf( testStrings[i] ));
		}
}