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


public class CodexTest_0_4_68 { 
  @Test
  public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        Object[] a = list.toArray();
        assertEquals(26, a.length);
        assertEquals("a", list.remove(0));
        assertEquals(25, list.size());
        assertEquals("b", list.remove(0));
        assertEquals(24, list.size());
        assertEquals("c", list.remove(0));
        assertEquals(23, list.size());
        assertEquals("d", list.remove(0));
        assertEquals(22, list.size());
        assertEquals("e", list.remove(0));
        assertEquals(21, list.size());
        assertEquals("f", list.remove(0));
        assertEquals(20, list.size());
        assertEquals("g", list.remove(0));
        assertEquals(19, list.size());
        assertEquals("h", list.remove(0));
        assertEquals(18, list.size());
        assertEquals("i", list.remove(0));
        assertEquals(17, list.size());
        assertEquals("j", list.remove(0
}