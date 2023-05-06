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


public class CodexTest_0_5_42 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        assertEquals(new Integer(2), al.remove(2));
        assertEquals(7, al.size());
        assertEquals(new Integer(0), al.remove(0));
        assertEquals(6, al.size());
        assertEquals(new Integer(7), al.remove(4));
        assertEquals(5, al.size());
        assertEquals(new Integer(3), al.remove(1));
        assertEquals(4, al.size());
        assertEquals(new Integer(4), al.remove(1));
        assertEquals(3, al.size());
        assertEquals(new Integer(5), al.remove(1));
        assertEquals(2, al.size());
        assertEquals(new Integer(1), al.remove(0));
        assertEquals(1, al.size());
        assertEquals(new Integer(6), al.remove(0));
        assertEquals(0, al.size());
    }
}