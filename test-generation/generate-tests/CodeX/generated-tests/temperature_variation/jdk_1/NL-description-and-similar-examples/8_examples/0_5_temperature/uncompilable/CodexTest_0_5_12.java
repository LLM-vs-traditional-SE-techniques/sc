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


public class CodexTest_0_5_12 { 
  @Test
        public void testRemove() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        List<Integer> copy = new ArrayList<>(list);
        assertEquals(Integer.valueOf(1), list.remove(1));
        assertEquals(Arrays.asList(3, 4, 1, 5, 9), list);
        assertEquals(copy, copy);
        try {
            list.remove(6);
            shouldThrow();
        } catch (IndexOutOfBoundsException expected) {
        }
    }
}