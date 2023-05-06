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


public class CodexTest_0_6_6 { 
  @Test
    public void testContains() {
        assertTrue(Arrays.asList("a", "b", "c").contains("a"));
        assertTrue(Arrays.asList("a", "b", "c").contains("b"));
        assertTrue(Arrays.asList("a", "b", "c").contains("c"));
        assertFalse(Arrays.asList("a", "b", "c").contains("d"));
    }
}