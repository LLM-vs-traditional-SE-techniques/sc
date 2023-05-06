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


public class CodexTest_0_9_65 { 
  @Test
        public void testRemoveByIndex2() {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        Object obj = vector.remove((3));
        assertTrue(obj.equals(4));
        Object obj2 = vector.remove((2));
        assertTrue(obj2.equals(3));
        assertEquals(vector.elementCount, 2);
        assertEquals((Integer) vector.elementData[0], Integer.valueOf(1));
        assertEquals((Integer) vector.elementData[1], Integer.valueOf(2));
    }
}