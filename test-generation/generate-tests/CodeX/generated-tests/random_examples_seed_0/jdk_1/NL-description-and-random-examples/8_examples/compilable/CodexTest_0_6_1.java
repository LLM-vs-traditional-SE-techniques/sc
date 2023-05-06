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


public class CodexTest_0_6_1 { 
        @Test
        public void testRemoveAt() {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            assertSame(1, list.remove(0));
            assertEquals(Arrays.asList(2, 3, 4, 5), list);
            assertSame(5, list.remove(list.size()-1));
            assertEquals(Arrays.asList(2, 3, 4), list);
            assertSame(3, list.remove(1));
            assertEquals(Arrays.asList(2, 4), list);
        }
}