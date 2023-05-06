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


public class CodexTest_0_7_1 { 
  @Test
        public static void testIndexOf() {
            Object[] a = new Object[10];
            for (int i = 0; i < 10; i++) {
                a[i] = new Object();
            }
            Arrays.sort(a);
            assertEquals(0, Arrays.binarySearch(a, new Object()));
            assertEquals(1, Arrays.binarySearch(a, a[0]));
            assertEquals(2, Arrays.binarySearch(a, a[1]));
            assertEquals(6, Arrays.binarySearch(a, a[6]));
            assertEquals(9, Arrays.binarySearch(a, a[9]));
            assertEquals(-1, Arrays.binarySearch(a, new Object()));
        }
}