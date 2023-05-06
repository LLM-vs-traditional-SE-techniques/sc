import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
   public void testContains() {
        String o1 = "one";
        String o2 = "two";
        String o3 = "three";
        String o4 = "four";
        String o5 = null;
        String[] delegate = {o1, o2, o3, o4, o5, o1, o2, o3, o4, o5,};
        ArrayList list = new ArrayList(Arrays.asList(delegate));
        ArrayList sublist = new ArrayList(Arrays.asList(delegate));
        sublist.remove(o5);
        assertEquals("List should contain null element.", 5, list.size());
        assertTrue("List should contain null element.", list.contains(o5));
        assertEquals("SubList should not contain null element.", 10, sublist.size());
        assertTrue("SubList should contain o1 element.", sublist.contains(o1));
        assertFalse("SubList should not contain null element.", sublist.contains(o5));
        assertSame("SubList should contain identical o1 element.", o1, sublist.get(0));
    }
}