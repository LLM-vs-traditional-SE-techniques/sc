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


public class CodexTest_0_8_10 { 
  @Test
    public void testContains() {
        Object[] a2 = { "A", "B", "C", "D" };
        ArrayList<Object> l2 = new ArrayList<Object>(Arrays.asList(a2));
        assertTrue("Contains \"C\"", l2.contains("C"));
        assertFalse("Does not contain \"E\"", l2.contains("E"));
    }
}