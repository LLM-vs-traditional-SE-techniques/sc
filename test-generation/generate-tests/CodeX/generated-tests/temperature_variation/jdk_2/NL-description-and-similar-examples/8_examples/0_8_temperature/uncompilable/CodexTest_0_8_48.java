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


public class CodexTest_0_8_48 { 
  @Test
    public void testIndexOf() {
        int[] data = {2, 3, 5};
        AlgVector v = new AlgVector(data);
        assertEquals(-1, v.indexOf(new Integer(0)));
        assertEquals(-1, v.indexOf(new Integer(1)));
        assertEquals(0, v.indexOf(new Integer(2)));
        assertEquals(1, v.indexOf(new Integer(3)));
        assertEquals(-1, v.indexOf(new Integer(4)));
        assertEquals(2, v.indexOf(new Integer(5)));
    }
    public void testContains() {
        int[] data = {2, 3, 5};
        AlgVector v = new AlgVector(data);
        assertFalse(v.contains(new Integer(0)));
        assertFalse(v.contains(new Integer(1)));
        assertTrue(v.contains(new Integer(2)));
        assertTrue(v.contains(new Integer(3)));
        assertFalse(v.contains(new Integer(4)));
        assertTrue(v.contains(new Integer(5)));
    }
}