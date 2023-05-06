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


public class CodexTest_0_6_10 { 
  @Test
    public void testContains() {
        assertFalse(list.contains(null));
        assertFalse(list.contains(100));
        assertFalse(list.contains(101));
        assertFalse(list.contains(102));
        assertFalse(list.contains(103));
        list.add(100);
        assertFalse(list.contains(null));
        assertTrue(list.contains(100));
        assertFalse(list.contains(101));
        assertFalse(list.contains(102));
        assertFalse(list.contains(103));
        list.add(101);
        assertFalse(list.contains(null));
        assertTrue(list.contains(100));
        assertTrue(list.contains(101));
        assertFalse(list.contains(102));
        assertFalse(list.contains(103));
        list.add(102);
        assertFalse(list.contains(null));
        assertTrue(list.contains(100));
        assertTrue(list.contains(101));
        assertTrue(list.contains(102));
        assertFalse(list.contains(103));
        list.add(103);
        assertFalse(list.contains(null));
        assertTrue(list.contains(100));
        assertTrue(list.contains(101));
        assertTrue(list.contains(102));
        assertTrue(list.contains(103));
    }
}