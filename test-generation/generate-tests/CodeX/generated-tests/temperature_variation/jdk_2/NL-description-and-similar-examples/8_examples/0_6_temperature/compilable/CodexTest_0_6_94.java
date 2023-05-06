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


public class CodexTest_0_6_94 { 
  @Test
    public void testContainsObject() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Vector<Object> v = new Vector<Object>();
        assertFalse(v.contains(o1));
        v.add(o1);
        assertTrue(v.contains(o1));
        assertFalse(v.contains(o2));
        v.add(o2);
        assertTrue(v.contains(o2));
        assertFalse(v.contains(o3));
        v.add(o3);
        assertTrue(v.contains(o3));
    }
}