import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
  public void testToShort() {
    ShortTypeDescriptor descriptor = new ShortTypeDescriptor();
    assertEquals( (short) 0, descriptor.wrap( false, null ) );
    assertEquals( (short) 1, descriptor.wrap( true, null ) );
    assertEquals( (short) 2, descriptor.wrap( "2", null ) );
    assertEquals( (short) 3, descriptor.wrap( (short) 3, null ) );
    assertEquals( (short) 4, descriptor.wrap( (byte) 4, null ) );
    assertEquals( (short) 5, descriptor.wrap( (float) 5, null ) );
    assertEquals( (short) 6, descriptor.wrap( (double) 6, null ) );
    assertEquals( (short) 7, descriptor.wrap( "7", null ) );
    assertEquals( (short) 8, descriptor.wrap( (long) 8, null ) );
    assertEquals( (short) 9, descriptor.wrap( (char) 9, null ) );
    assertEquals( (short) 10, descriptor.wrap( new Integer( 10 ), null ) );
    assertEquals( (short) 11, descriptor.wrap( new Byte( 11 ), null ) );
    assertEquals( (short) 12, descriptor.wrap( new Float( 12 ), null ) );
    assertEquals( (short) 13, descriptor.wrap( new Double( 13 ), null ) );
    assertEquals( (short) 14, descriptor.wrap( new Long( 14 ), null ) );
    assertEquals( (short) 15, descriptor.wrap( new Character( u0015 ), null ) );
    assertEquals( (short) 16, descriptor.wrap( new String( "16" ), null ) );
  }
}