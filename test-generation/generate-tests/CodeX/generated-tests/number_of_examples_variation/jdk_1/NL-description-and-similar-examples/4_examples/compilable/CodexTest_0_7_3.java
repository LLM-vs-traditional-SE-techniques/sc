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


public class CodexTest_0_7_3 { 
    @Test
    public void testRemove() {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        assertEquals(5, t.size());
        assertEquals(1, (int) t.get(0));
        assertEquals(2, (int) t.get(1));
        assertEquals(3, (int) t.get(2));
        assertEquals(4, (int) t.get(3));
        assertEquals(5, (int) t.get(4));
        assertEquals(1, (int) t.remove(0));
        assertEquals(4, t.size());
        assertEquals(2, (int) t.get(0));
        assertEquals(3, (int) t.get(1));
        assertEquals(4, (int) t.get(2));
        assertEquals(5, (int) t.get(3));
        assertEquals(2, (int) t.remove(0));
        assertEquals(3, t.size());
        assertEquals(3, (int) t.get(0));
        assertEquals(4, (int) t.get(1));
        assertEquals(5, (int) t.get(2));
        assertEquals(5, (int) t.remove(2));
        assertEquals(2, t.size());
        assertEquals(3, (int) t.get(0));
        assertEquals(4, (int) t.get(1));
        assertEquals(3, (int) t.remove(0));
        assertEquals(1, t.size());
        assertEquals(4, (int) t.get(0));
        assertEquals(4, (int) t.remove(0));
        assertEquals(0, t.size());
    }
}