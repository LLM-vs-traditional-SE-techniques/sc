import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_34 { 
  @Test
    public void testToShort() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		assertThat(underTest.toShort(true), is((short) 1));
		assertThat(underTest.toShort(false), is((short) 0));
		assertNull(underTest.toShort(null));
	}
}