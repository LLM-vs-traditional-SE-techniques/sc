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


public class CodexTest_0_5_11 { 
  @Test
    public void testContains() {
        Object[] a = new Object[] { "A", "B", "C", "D" };
        List<Object> c = Arrays.asList(a);
        assertTrue(c.contains("A"));
        assertTrue(c.contains("B"));
        assertTrue(c.contains("C"));
        assertTrue(c.contains("D"));
        assertFalse(c.contains("Z"));
        assertFalse(c.contains(null));
    }
}