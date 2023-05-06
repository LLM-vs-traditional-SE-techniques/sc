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


public class CodexTest_0_5_20 { 
  @Test
    public void testContains() {
        assertFalse(set.contains(null));
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        set.add(1);
        assertFalse(set.contains(null));
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        set.add(3);
        assertFalse(set.contains(null));
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
        assertTrue(set.contains(3));
        set.add(2);
        assertFalse(set.contains(null));
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
    }
}