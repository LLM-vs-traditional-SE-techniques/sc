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


public class CodexTest_0_7_4 { 
  @Test
    public void testContains_Object() {
        DoubleArrayList doubleArrayList = new DoubleArrayList();
        doubleArrayList.add(1.1);
        doubleArrayList.add(2.2);
        doubleArrayList.add(3.3);
        doubleArrayList.add(4.4);
        doubleArrayList.add(5.5);
        assertTrue(doubleArrayList.contains(1.1));
        assertTrue(doubleArrayList.contains(2.2));
        assertTrue(doubleArrayList.contains(3.3));
        assertTrue(doubleArrayList.contains(4.4));
        assertTrue(doubleArrayList.contains(5.5));
        assertFalse(doubleArrayList.contains(1.0));
        assertFalse(doubleArrayList.contains(2.0));
        assertFalse(doubleArrayList.contains(3.0));
        assertFalse(doubleArrayList.contains(4.0));
        assertFalse(doubleArrayList.contains(5.0));
    }
}