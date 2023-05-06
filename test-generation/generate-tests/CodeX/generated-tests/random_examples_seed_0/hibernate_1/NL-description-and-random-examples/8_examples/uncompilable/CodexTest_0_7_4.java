import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
  public void testToShort() {
		Short s = Short.valueOf( (short) 3 );
		assertEquals( s, converter.toShort( s ) );
		assertEquals( s, converter.toShort( Boolean.TRUE ) );
		assertEquals( Short.valueOf( (short) 0 ), converter.toShort( Boolean.FALSE ) );
	}
}