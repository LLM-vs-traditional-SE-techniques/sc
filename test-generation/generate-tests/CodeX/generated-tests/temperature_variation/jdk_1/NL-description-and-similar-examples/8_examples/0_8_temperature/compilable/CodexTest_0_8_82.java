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


public class CodexTest_0_8_82 { 
  @Test
    public void testRemove_int() {
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(0);
    l.add(11);
    l.add(22);
    l.add(33);
    assertEquals(4, l.size());
    assertTrue(l.containsAll(Arrays.asList(new Integer[] {0,11,22,33})));
    assertEquals(new Integer(22), l.remove(2));
    assertEquals(3, l.size());
    assertTrue(l.containsAll(Arrays.asList(new Integer[] {0,11,33})));
  }
}