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


public class CodexTest_0_7_54 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY - 1; i++) {
            a[i] = i;
        }
        a[DEFAULT_CAPACITY - 1] = this;
        a = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY - 1; i++) {
            a[i] = i;
        }
        a[DEFAULT_CAPACITY - 1] = this;
        ArrayList<Object> al = new ArrayList<>();
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            al.add(a[i]);
        }
        al.remove(DEFAULT_CAPACITY - 1);
        assertEquals(a[DEFAULT_CAPACITY - 2], al.get(DEFAULT_CAPACITY - 2));
        assertEquals(DEFAULT_CAPACITY - 1, al.size());
    }
}