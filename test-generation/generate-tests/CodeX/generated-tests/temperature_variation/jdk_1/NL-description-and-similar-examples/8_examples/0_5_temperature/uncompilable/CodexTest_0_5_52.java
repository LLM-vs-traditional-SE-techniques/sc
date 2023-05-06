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


public class CodexTest_0_5_52 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[SIZE];
        Arrays.fill(a, new Object());
        ArrayList<Object> al = new ArrayList<>();
        al.addAll(Arrays.asList(a));
        Object o = new Object();
        al.add(o);
        assertEquals(o, al.remove(SIZE));
        assertEquals(SIZE, al.size());
        assertTrue(Arrays.equals(a, al.toArray()));
    }
}