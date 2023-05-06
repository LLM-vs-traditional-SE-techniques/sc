import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
       public void testFromStringTrue(){
            Assert.assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("true")));
        }
       public void testFromStringTrueUpperCase(){
            Assert.assertTrue(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("True")));
        }
       public void testFromStringTrueWithLeadingAndTrainingSpaces(){
            Assert.assertTrue(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("   true")));
        }
       public void testFromStringTrueWithTrailingSpaces(){
            Assert.assertTrue(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("true   ")));
        }
       @Test
       public void testFromStringFalse(){
            Assert.assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("false")));
        }
       @Test
       public void testFromStringFalseUpperCase(){
            Assert.assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("False")));
        }
       @Test
       public void testFromStringFalseWithLeadingAndTrainingSpaces(){
            Assert.assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("false   ")));
        }
       @Test
       public void testFromStringFalseWithTrainingSpaces(){
            Assert.assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("   false")));
        }
}