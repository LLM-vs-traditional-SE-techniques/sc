import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
   int v2 = v1.toInt(true);
   boolean b2 = v1.toBoolean(v2);
   assertEquals( b1, b2 );
   short s1 = 1;
   short s2 = v1.toShort(b2);
   assertEquals( s1, s2 );
}