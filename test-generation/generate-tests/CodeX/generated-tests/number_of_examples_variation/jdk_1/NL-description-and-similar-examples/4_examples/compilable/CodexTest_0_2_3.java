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


public class CodexTest_0_2_3 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[] { "A", "B", "C", "D" };
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        assertEquals("A", list.remove(0));
        assertEquals("C", list.remove(1));
        assertEquals("B", list.remove(0));
        assertEquals("D", list.remove(0));
        assertEquals(0, list.size());
    }
}