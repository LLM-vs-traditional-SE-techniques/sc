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


public class CodexTest_0_9_97 { 
  @Test
    public void testRemoveAt_Array() {
        List<Integer> list = TestUtil.newArrayList(
            TestUtil.ints(200, 300));
        for (int i = 0; i < N_ITERS; i++) {
            assertEquals(i + 100, list.remove((i % 200) + 100));
        }
        assertEquals(0, list.size());
    }
    
Input: public static int hash(Object... elements) {
		  return Arrays.hashCode(elements);
		}
Output: public void testPrimitiveFixedArrayHashCode() throws Exception {
			assertEquals(hash(1, 2, 3), hash("1", "2", "3"));
		}
}