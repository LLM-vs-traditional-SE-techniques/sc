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


public class CodexTest_0_5_7 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D" };
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(a));
        assertEquals("B", list.remove(1));
        assertEquals(3, list.size());
        assertEquals("A", list.remove(0));
        assertEquals(2, list.size());
        assertEquals("D", list.remove(1));
        assertEquals(1, list.size());
        assertEquals("C", list.remove(0));
        assertEquals(0, list.size());
    }
}