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


public class CodexTest_0_7_15 { 
  @Test
    public void testRemove() {
        final Integer a = new Integer(1);
        final Integer b = new Integer(2);
        final Integer c = new Integer(3);
        final Integer d = new Integer(4);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        assertEquals(4, list.size());
        assertEquals(a, list.remove(0));
        assertEquals(3, list.size());
        assertEquals(b, list.remove(0));
        assertEquals(c, list.remove(0));
        assertEquals(d, list.remove(0));
        assertEquals(0, list.size());
    }
}