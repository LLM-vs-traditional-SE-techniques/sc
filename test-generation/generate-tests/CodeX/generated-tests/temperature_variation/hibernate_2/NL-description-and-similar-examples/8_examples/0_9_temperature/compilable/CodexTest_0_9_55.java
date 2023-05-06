import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_55 { 
  @Test
    public void testFromStringShouldReturnFalseWhenFStringGiven() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("f");
		// then
		assertFalse(result);
	}

}