import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_45 { 
  @Test
       public void testFromString() {
           assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("true"));
           assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("True"));
           assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("TruE"));
           assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("trUe"));
           assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("1"));
           assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("false"));
           assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("False"));
           assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("FAlse"));
           assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("faLse"));
           assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("0"));
       }

}