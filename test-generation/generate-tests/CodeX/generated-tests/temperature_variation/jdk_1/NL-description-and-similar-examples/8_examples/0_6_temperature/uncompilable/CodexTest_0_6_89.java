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


public class CodexTest_0_6_89 { 
  @Test
    public void testRemove() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(3);
        assertEquals(Integer.valueOf(0), list.get(0));
        assertEquals(Integer.valueOf(1), list.get(1));
        assertEquals(Integer.valueOf(2), list.get(2));
        assertEquals(Integer.valueOf(4), list.get(3));
        assertEquals(Integer.valueOf(5), list.get(4));
        assertEquals(Integer.valueOf(6), list.get(5));
        assertEquals(Integer.valueOf(7), list.get(6));
        assertEquals(Integer.valueOf(8), list.get(7));
        assertEquals(Integer.valueOf(9), list.get(8));
        assertEquals(9, list.size());
        list.remove(1);
        assertEquals(Integer.valueOf(0), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(4), list.get(2));
        assertEquals(Integer.valueOf(5), list.get(3));
        assertEquals(Integer.valueOf(6), list.get(4));
        assertEquals(Integer.valueOf(7), list.get(5));
        assertEquals(Integer.valueOf(8), list.get(6));
        assertEquals(Integer.valueOf(9), list.get(7));
        assertEquals(8, list.size());
        list.remove(7);
        assertEquals(Integer.valueOf(0), list.get(0));
        assertEquals(
}