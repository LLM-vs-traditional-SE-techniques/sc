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


public class CodexTest_0_7_2 { 
    @Test
    public void testRemoveIndex() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(6);
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertEquals(Integer.valueOf(3), list.remove(1));
        assertEquals(Integer.valueOf(4), list.remove(2));
        assertEquals(Integer.valueOf(5), list.remove(2));
        assertEquals(Integer.valueOf(6), list.remove(3));
        assertEquals(Integer.valueOf(4), list.remove(3));
        assertEquals(Integer.valueOf(5), list.remove(3));
        assertEquals(Integer.valueOf(6), list.remove(3));
        assertEquals(Integer.valueOf(2), list.remove(0));
    }
}