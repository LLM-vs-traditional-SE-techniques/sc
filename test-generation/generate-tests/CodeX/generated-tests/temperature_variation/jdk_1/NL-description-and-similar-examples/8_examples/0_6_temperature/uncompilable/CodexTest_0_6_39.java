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


public class CodexTest_0_6_39 { 
  @Test
    public void testRemoveIndex() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; i++)
            a[i] = new Integer(i);
        ArrayList<Object> al = new ArrayList<>();
        for (int i = 0; i < SIZE; i++)
            al.add(a[i]);
        Object o;
        for (int i = 0; i < SIZE; i++) {
            o = al.remove(i);
            assertEquals(a[i], o);
            assertEquals(SIZE-i-1, al.size());
        }
    }
}