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


public class CodexTest_0_6_63 { 
  @Test
    public void testContains() {
        ImmutableSet<Integer> set = createTestSet();
        for (Integer value : set) {
            assertTrue("set should contain " + value, set.contains(value));
        }
        assertFalse("set should not contain null", set.contains(null));
        assertFalse("set should not contain 42", set.contains(42));
    }
}