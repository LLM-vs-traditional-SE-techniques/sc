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


public class CodexTest_0_6_21 { 
  @Test
    public void testRemove() {
        Random r = new Random(5);
        for (int i = 0; i < 20; ++i) {
            Object[] a = new Object[i];
            for (int j = 0; j < i; j++) {
                a[j] = new Integer(j);
            }
            ArrayList l = new ArrayList(Arrays.asList(a));
            int index = r.nextInt(i);
            Object element = l.remove(index);
            assertTrue(element.equals(a[index]));
            for (int j = 0; j < i; j++) {
                if (j < index) {
                    assertTrue(l.get(j).equals(a[j]));
                } else if (j > index) {
                    assertTrue(l.get(j - 1).equals(a[j]));
                }
            }
        }
    }
}