import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
        assertEquals((short) 1,underTest.toShort(true));
Input: public String[] getTarget(MoreAnnotations target) {
    return new String[] {
      AnnotationUtils.getAnnotation(target.getClass(), Third.class).value()
    };
  }
Output: public void testGetTarget() {
    assertEquals(
        "third",
        AnnotationUtils.getAnnotation(MoreAnnotations.class, Target.class).value());
    assertEquals(
        "third", AnnotationUtils.getAnnotation(TargetAnnotation.class, Target.class).value());
  }
}