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


public class CodexTest_0_5_55 { 
  @Test
    public void testRemove() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        Object o5 = new Object();
        Object o6 = new Object();
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(o1);
        al.add(o2);
        al.add(o3);
        al.add(o4);
        al.add(o5);
        al.add(o6);
        assertEquals(o3, al.remove(2));
        assertEquals(o1, al.get(0));
        assertEquals(o2, al.get(1));
        assertEquals(o4, al.get(2));
        assertEquals(o5, al.get(3));
        assertEquals(o6, al.get(4));
        assertEquals(5, al.size());
        assertEquals(o1, al.remove(0));
        assertEquals(o2, al.remove(0));
        assertEquals(o4, al.remove(0));
        assertEquals(o5, al.remove(0));
        assertEquals(o6, al.remove(0));
        assertEquals(0, al.size());
    }
}