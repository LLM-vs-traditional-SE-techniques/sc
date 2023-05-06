import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_7 { 
  @Test
    public void testFromString() {
        Boolean b = Boolean.TRUE;
        assertEquals(b, BooleanUtils.toBooleanObject(b.toString()));
        assertEquals(b, BooleanUtils.toBooleanObject("true"));
        assertEquals(b, BooleanUtils.toBooleanObject("on"));
        assertEquals(b, BooleanUtils.toBooleanObject("yes"));
}