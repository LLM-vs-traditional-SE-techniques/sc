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


public class CodexTest_0_8_24 { 
  @Test
    public void testContains() {
        Collection c = new ArrayList();
        c.add("banana");
        c.add("apple");
        c.add("pear");
        assertTrue(c.contains("banana"));
        assertTrue(c.contains("apple"));
        assertTrue(c.contains("pear"));
        assertFalse(c.contains("orange"));
        assertFalse(c.contains(null));
    }
}