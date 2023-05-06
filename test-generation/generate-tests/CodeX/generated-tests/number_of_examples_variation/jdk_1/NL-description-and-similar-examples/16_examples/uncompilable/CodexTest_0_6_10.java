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


public class CodexTest_0_6_10 { 
  @Test
    public void testRemove() {
        boolean[] a = new boolean[]{true, false, true, true, true, true, false, false, false, false, true};
        assertEquals(true, a[0]);
        assertEquals(false, a[1]);
        assertEquals(true, a[2]);
        assertEquals(true, a[3]);
        assertEquals(true, a[4]);
        assertEquals(true, a[5]);
        assertEquals(false, a[6]);
        assertEquals(false, a[7]);
        assertEquals(false, a[8]);
        assertEquals(false, a[9]);
        assertEquals(true, a[10]);
        assertEquals(11, a.length);
        a = Arrays.remove(a, 0);
        assertEquals(10, a.length);
        assertEquals(false, a[0]);
        assertEquals(true, a[1]);
        assertEquals(true, a[2]);
        assertEquals(true, a[3]);
        assertEquals(true, a[4]);
        assertEquals(false, a[5]);
        assertEquals(false, a[6]);
        assertEquals(false, a[7]);
        assertEquals(false, a[8]);
        assertEquals(true, a[9]);
        a = Arrays.remove(a, 0);
        assertEquals(9, a.length);
        assertEquals(true, a[0]);
        assertEquals(true, a[1]);
        assertEquals(true, a[2]);
        assertEquals(true, a[3]);
        assertEquals(false, a[4]);
        assertEquals(false, a[5]);
        assertEquals(false, a[6]);
        assertEquals(false, a[7]);
        assertEquals(true, a[8]);
        a = Arrays.remove(a, 1);
        assertEquals(8, a.length);
        assertEquals(true, a[0]);
       
}