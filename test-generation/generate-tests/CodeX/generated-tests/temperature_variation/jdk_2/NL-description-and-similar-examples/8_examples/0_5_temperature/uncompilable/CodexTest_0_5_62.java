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


public class CodexTest_0_5_62 { 
  @Test
    public void testContains() {
        assertTrue(set.contains(new Integer(1)));
        assertTrue(set.contains(new Integer(2)));
        assertTrue(set.contains(new Integer(3)));
        assertTrue(set.contains(new Integer(4)));
        assertTrue(set.contains(new Integer(5)));
        assertTrue(set.contains(new Integer(6)));
        assertTrue(set.contains(new Integer(7)));
        assertTrue(set.contains(new Integer(8)));
        assertTrue(set.contains(new Integer(9)));
        assertTrue(set.contains(new Integer(10)));
        assertFalse(set.contains(new Integer(11)));
        assertFalse(set.contains(new Integer(0)));
        assertFalse(set.contains(""));
    }
}