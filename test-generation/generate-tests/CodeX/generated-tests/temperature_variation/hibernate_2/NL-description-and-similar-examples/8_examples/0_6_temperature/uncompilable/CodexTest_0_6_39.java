import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_39 { 
  @Test
  public void testFromString() {
		assertEquals(Boolean.TRUE, Boolean.valueOf(true).fromString("true"));
		assertEquals(Boolean.FALSE, Boolean.valueOf(true).fromString("false"));
	}
}