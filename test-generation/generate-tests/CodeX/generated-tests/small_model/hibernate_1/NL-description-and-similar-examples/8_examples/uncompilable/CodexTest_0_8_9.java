import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  public void testToShort() {
    assertEquals(new Short((short)0), myType.wrap(null, null));
    assertEquals(new Short((short)0), myType.wrap(FALSE, null));
    assertEquals(new Short((short)1), myType.wrap(TRUE, null));
    assertEquals(new Short((short)0), myType.wrap(new Boolean(false), null));
    assertEquals(new Short((short)1), myType.wrap(new Boolean(true), null));
    assertEquals(new Short((short)0), myType.wrap(new Byte((byte)0), null));
    assertEquals(new Short((short)1), myType.wrap(new Byte((byte)1), null));
    assertEquals(new Short((short)0), myType.wrap(new Character((char)0), null));
    assertEquals(new Short((short)1), myType.wrap(new Character((char)1), null));
    assertEquals(new Short((short)0), myType.wrap(new Double(0), null));
    assertEquals(new Short((short)1), myType.wrap(new Double(1), null));
    assertEquals(new Short((short)0), myType.wrap(new Float(0), null));
    assertEquals(new Short((short)1), myType.wrap(new Float(1), null));
    assertEquals(new Short((short)0), myType.wrap(new Integer(0), null));
    assertEquals(new Short((short)1), myType.wrap(new Integer(1), null));
    assertEquals(new Short((short)0), myType.wrap(new Long(0), null));
    assertEquals(new Short((short)1), myType.wrap(new Long(1), null));
    assertEquals(new Short((short)0), myType.wrap(new Short((short)0), null));
    assertEquals(new Short((short)1), myType.wrap(new Short((short)1), null));
  }
}