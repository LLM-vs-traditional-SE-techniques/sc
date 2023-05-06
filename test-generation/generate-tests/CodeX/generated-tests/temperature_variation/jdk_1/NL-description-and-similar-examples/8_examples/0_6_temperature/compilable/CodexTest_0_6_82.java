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


public class CodexTest_0_6_82 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
        assertEquals(new Integer(0), list.remove(0));
        assertEquals(9, list.size());
        assertEquals(new Integer(1), list.remove(0));
        assertEquals(8, list.size());
        assertEquals(new Integer(8), list.remove(6));
        assertEquals(7, list.size());
        assertEquals(new Integer(9), list.remove(6));
        assertEquals(6, list.size());
        assertEquals(new Integer(2), list.remove(0));
        assertEquals(5, list.size());
        assertEquals(new Integer(7), list.remove(3));
        assertEquals(4, list.size());
        assertEquals(new Integer(3), list.remove(0));
        assertEquals(3, list.size());
        assertEquals(new Integer(4), list.remove(0));
        assertEquals(2, list.size());
        assertEquals(new Integer(5), list.remove(0));
        assertEquals(1, list.size());
        assertEquals(new Integer(6), list.remove(0));
        assertEquals(0, list.size());
    }
}