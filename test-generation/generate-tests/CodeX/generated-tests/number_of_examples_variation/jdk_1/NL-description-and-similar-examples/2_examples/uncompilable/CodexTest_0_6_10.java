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


public class CodexTest_0_6_10 { 
  @Test
    public void testRemoveIndex() {
        for (int i = 0; i < 1000; i++) {
            int n = ThreadLocalRandom.current().nextInt(1, 10);
            List<Integer> list = newArrayList();
            for (int j = 0; j < n; j++)
                list.add(j);
            int index = ThreadLocalRandom.current().nextInt(0, n);
            int removed = list.remove(index);
            assertEquals(removed, index);
            assertEquals(list.size(), n - 1);
        }
    }
*/
}