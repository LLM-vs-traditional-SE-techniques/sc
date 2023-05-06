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


public class CodexTest_0_7_94 { 
  @Test
    public void testRemoveRange() {
        Object[] a = new Object[SIZE];
        for(int i = 0; i < SIZE; i++) {
            a[i] = "a" + i;
        }
        ArrayList al = new ArrayList(SIZE);
        for(int i = 0; i < SIZE; i++) {
            al.add(a[i]);
        }
        al.subList(0, SIZE/2).clear();
        assertEquals("removeRange failed to remove correct range",
                     SIZE/2, al.size());
        for(int i = SIZE/2; i < SIZE; i++) {
            assertEquals("removeRange failed to remove correct range",
                         "a" + i, al.get(i-SIZE/2));
        }
    }
}