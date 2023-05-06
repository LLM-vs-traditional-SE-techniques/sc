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


public class CodexTest_0_5_33 { 
  @Test
    public void testContains() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = -2; i < 3; i++) {
            assertFalse(set.contains(i));
            set.add(i);
            assertTrue(set.contains(i));
        }
    }
}