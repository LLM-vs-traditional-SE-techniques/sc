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


public class CodexTest_0_7_7 { 
  @Test
    public void testRemove_int() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        list.add(new Integer(6));
        list.remove(0);
        assertEquals("Removed first element", list.size(), 6);
        assertEquals("Removed first element",
                new Integer(1), list.get(0));
        list.remove(5);
        assertEquals("Removed last element", list.size(), 5);
        assertEquals("Removed last element",
                new Integer(5), list.get(4));
        list.remove(2);
        assertEquals("Removed middle element", list.size(), 4);
        assertEquals("Removed middle element",
                new Integer(3), list.get(2));
    }
}