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


public class CodexTest_0_5_93 { 
  @Test
    public void testRemove() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        Object o5 = new Object();
        Object o6 = new Object();
        Object o7 = new Object();
        Object o8 = new Object();
        Object o9 = new Object();
        ArrayList<Object> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        list.add(o6);
        list.add(o7);
        list.add(o8);
        list.add(o9);
        assertEquals(9, list.size());
        list.remove(0);
        assertEquals(8, list.size());
        assertEquals(o2, list.get(0));
        assertEquals(o3, list.get(1));
        assertEquals(o4, list.get(2));
        assertEquals(o5, list.get(3));
        assertEquals(o6, list.get(4));
        assertEquals(o7, list.get(5));
        assertEquals(o8, list.get(6));
        assertEquals(o9, list.get(7));
        list.remove(7);
        assertEquals(7, list.size());
        assertEquals(o2, list.get(0));
        assertEquals(o3, list.get(1));
        assertEquals(o4, list.get(2));
        assertEquals(o5, list.get(3));
        assertEquals(o6, list.get(4));
        assertEquals(o7, list.get(5));
        assertEquals(o8, list.get(6));
        list.remove(6);
        assertEquals(6, list.size());
        assertEquals(o2, list.get(0));
        assertEqu
}