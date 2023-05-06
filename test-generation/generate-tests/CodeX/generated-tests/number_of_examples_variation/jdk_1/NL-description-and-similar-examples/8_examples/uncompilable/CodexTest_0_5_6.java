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


public class CodexTest_0_5_6 { 
  @Test
    public void testRemove() {
        ArrayList<Object> l = new ArrayList<Object>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        assertEquals(20, l.size());
        assertEquals(1, l.remove(0));
        assertEquals(19, l.size());
        assertEquals(20, l.remove(18));
        assertEquals(18, l.size());
        assertEquals(19, l.remove(17));
        assertEquals(17, l.size());
        assertEquals(18, l.remove(16));
        assertEquals(16, l.size());
        assertEquals(17, l.remove(15));
        assertEquals(15, l.size());
        assertEquals(16, l.remove(14));
        assertEquals(14, l.size());
        assertEquals(15, l.remove(13));
        assertEquals(13, l.size());
        assertEquals(14, l.remove(12));
        assertEquals(12, l.size());
        assertEquals(13, l.remove(11));
        assertEquals(11, l.size());
        assertEquals(12, l.remove(10));
        assertEquals(10, l.size());
        assertEquals(11, l.remove(9));
        assertEquals(9, l.size());
        assertEquals(10, l.remove(8));
        assertEquals
}