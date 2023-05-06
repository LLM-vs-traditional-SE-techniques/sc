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


public class CodexTest_0_8_70 { 
  @Test
        public void testRemove() {
        Collection<Integer> collection = createCollection();
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            assertFalse(collection.remove(value + 1));
            assertTrue(collection.remove(value));
            assertFalse(collection.contains(value));
        }
        assertTrue(collection.isEmpty());
    }
}