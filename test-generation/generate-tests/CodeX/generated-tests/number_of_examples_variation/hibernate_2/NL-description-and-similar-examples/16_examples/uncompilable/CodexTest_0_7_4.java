import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
    public void testFromString() {
		String trueString = Boolean.TRUE.toString();
		String falseString = Boolean.FALSE.toString();
		
		BooleanType booleanType = new BooleanType();
		
		assertEquals(Boolean.TRUE, booleanType.fromString(trueString));
		assertEquals(Boolean.FALSE, booleanType.fromString(falseString));
	}
}