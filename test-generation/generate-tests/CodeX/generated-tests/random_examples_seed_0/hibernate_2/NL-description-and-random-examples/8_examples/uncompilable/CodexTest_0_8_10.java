import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
    public void testBooleanFromString() {
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("false")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("FALSE")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("no")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("NO")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("n")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("N")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("off")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("OFF")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("0")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString("oFF")));
		assertFalse( Boolean.FALSE.equals(Boolean.fromString(" ")));
		assertFalse( Boolean.TRUE.equals(Boolean.fromString("truE")));
		assertFalse( Boolean.TRUE.equals(Boolean.fromString("yes")));
		assertFalse( Boolean.TRUE.equals(Boolean.fromString("1")));
		assertFalse( Boolean.TRUE.equals(Boolean.fromString("on")));
}