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


public class CodexTest_0_4_3 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        assertEquals("2", list.remove(1));
        assertEquals(4, list.size());
        assertEquals("1", list.get(0));
        assertEquals("3", list.get(1));
        assertEquals("4", list.get(2));
        assertEquals("5", list.get(3));
        assertEquals("3", list.remove(1));
        assertEquals(3, list.size());
        assertEquals("1", list.get(0));
        assertEquals("4", list.get(1));
        assertEquals("5", list.get(2));
        assertEquals("5", list.remove(2));
        assertEquals(2, list.size());
        assertEquals("1", list.get(0));
        assertEquals("4", list.get(1));
        assertEquals("1", list.remove(0));
        assertEquals(1, list.size());
        assertEquals("4", list.get(0));
        assertEquals("4", list.remove(0));
        assertEquals(0, list.size());
    }
}