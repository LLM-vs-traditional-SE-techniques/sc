import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_5 { 
  @Test
    public void testToShort() {
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			Short result = underTest.toShort(true);
			// then
			assertEquals(1, result.intValue());
		}
}