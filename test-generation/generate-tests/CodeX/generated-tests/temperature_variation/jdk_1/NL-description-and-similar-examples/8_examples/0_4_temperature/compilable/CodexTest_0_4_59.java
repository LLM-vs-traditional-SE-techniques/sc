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


public class CodexTest_0_4_59 { 
  @Test
  public void testRemove() {
        final Object[] a = new Object[3];
        a[0] = "0";
        a[1] = "1";
        a[2] = "2";
        final ArrayList<Object> l = new ArrayList<Object>(Arrays.asList(a));
        assertEquals("1", l.remove(1));
        assertEquals(Arrays.asList(0, 2), l);
        assertEquals("0", l.remove(0));
        assertEquals(Arrays.asList(2), l);
        assertEquals("2", l.remove(0));
        assertEquals(Arrays.asList(), l);
    }
}