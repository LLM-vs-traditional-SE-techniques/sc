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


public class CodexTest_0_5_80 { 
  @Test
    public void testContains() {
        Object[] x = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<Object> list = new ArrayList<Object>(x.length);
        for (Object o : x) {
            list.add(o);
        }
        assertTrue("Does not contain 1", list.contains("1"));
        assertTrue("Does not contain 2", list.contains("2"));
        assertTrue("Does not contain 3", list.contains("3"));
        assertTrue("Does not contain 4", list.contains("4"));
        assertTrue("Does not contain 5", list.contains("5"));
        assertTrue("Does not contain 6", list.contains("6"));
        assertTrue("Does not contain 7", list.contains("7"));
        assertTrue("Does not contain 8", list.contains("8"));
        assertTrue("Does not contain 9", list.contains("9"));
        assertFalse("Contains 10", list.contains("10"));
    }
}