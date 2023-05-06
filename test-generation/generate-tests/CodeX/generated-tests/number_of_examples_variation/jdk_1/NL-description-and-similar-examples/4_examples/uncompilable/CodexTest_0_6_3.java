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


public class CodexTest_0_6_3 { 
  @Test
   public void testRemoveRange() {
        Object[] a = new Object[SIZE];
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < SIZE; i++){
            a[i] = new Integer(i);
            list.add(a[i]);
        }
        list.subList(SIZE/4, 3 * SIZE/4).clear();
        for (int i = 0; i < SIZE/4; i++)
            assertEquals(a[i], list.get(i));
        for (int i = 3 * SIZE/4; i < SIZE; i++)
            assertEquals(a[i], list.get(i-SIZE/2));
    }
}