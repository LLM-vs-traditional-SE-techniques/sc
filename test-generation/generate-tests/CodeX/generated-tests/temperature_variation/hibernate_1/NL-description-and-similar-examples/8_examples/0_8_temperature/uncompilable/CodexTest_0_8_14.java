import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_14 { 
  @Test
  public void testToShort() {
    assertEquals( null, ShortTypeDescriptor.INSTANCE.toShort( null ) );
    assertEquals( Short.valueOf( (short) 0 ), ShortTypeDescriptor.INSTANCE.toShort( Boolean.FALSE ) );
    assertEquals( Short.valueOf( (short) 1 ), ShortTypeDescriptor.INSTANCE.toShort( Boolean.TRUE ) );
  }

}