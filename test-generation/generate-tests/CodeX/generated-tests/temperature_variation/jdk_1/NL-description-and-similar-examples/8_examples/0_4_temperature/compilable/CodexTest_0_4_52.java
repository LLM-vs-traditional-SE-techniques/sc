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


public class CodexTest_0_4_52 { 
  @Test
    public void testRemove_int() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-2);
        list.add(-3);
        assertEquals(7, list.size());
        assertEquals(Integer.valueOf(3), list.remove(0));
        assertEquals(6, list.size());
        assertEquals(Integer.valueOf(2), list.remove(0));
        assertEquals(5, list.size());
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertEquals(4, list.size());
        assertEquals(Integer.valueOf(0), list.remove(0));
        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(-1), list.remove(0));
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(-2), list.remove(0));
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(-3), list.remove(0));
        assertEquals(0, list.size());
    }
}