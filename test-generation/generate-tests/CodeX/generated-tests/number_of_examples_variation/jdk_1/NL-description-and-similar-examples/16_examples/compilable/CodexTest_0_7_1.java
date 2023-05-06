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


public class CodexTest_0_7_1 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        list.add(new Integer(6));
        list.add(new Integer(7));
        list.add(new Integer(8));
        list.add(new Integer(9));
        list.remove(4);
        assertEquals("Removed wrong element", new Integer(5), list.get(4));
        assertEquals("Removed wrong element", new Integer(6), list.get(5));
        assertEquals("Removed wrong element", new Integer(7), list.get(6));
        assertEquals("Removed wrong element", new Integer(8), list.get(7));
        assertEquals("Removed wrong element", new Integer(9), list.get(8));
        assertTrue("Removed wrong number of elements", list.size() == 8);
    }
}