import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
    public void testToShort() {
		short s2 = 3;
		
		Converter conver = new Converter();
		
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean(false);
		
		assertEquals( s1, conver.toShort(bool1).shortValue() );
		assertEquals( s2, conver.toShort(bool2).shortValue() );
	}
}