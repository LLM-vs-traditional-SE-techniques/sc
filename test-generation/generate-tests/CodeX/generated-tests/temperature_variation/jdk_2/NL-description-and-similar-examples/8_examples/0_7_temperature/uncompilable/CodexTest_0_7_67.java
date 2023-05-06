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


public class CodexTest_0_7_67 { 
  @Test
    public void testContainsAll() {
        assertTrue(set.containsAll(Collections.emptySet()));
        assertTrue(set.containsAll(Arrays.asList(0, 1, 2)));
        assertTrue(set.containsAll(Arrays.asList(0, 1, 2, 3)));
        assertFalse(set.containsAll(Arrays.asList(1, 2, 3)));
        assertFalse(set.containsAll(Arrays.asList(0, 2, 3)));
        assertFalse(set.containsAll(Arrays.asList(0, 1, 3)));
        assertFalse(set.containsAll(Arrays.asList(0, 1, 2, 3, 4)));
        assertFalse(set.containsAll(Arrays.asList(0, 1, 2, 3, 4, 5)));
    }
}