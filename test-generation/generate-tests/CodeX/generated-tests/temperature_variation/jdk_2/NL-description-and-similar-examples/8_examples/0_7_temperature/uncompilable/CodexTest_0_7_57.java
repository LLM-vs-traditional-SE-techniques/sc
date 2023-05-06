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


public class CodexTest_0_7_57 { 
  @Test
    public void testContainsPredicate() {
        Predicate predicate = Predicates.contains("foo");
        assertFalse(predicate.apply(""));
        assertFalse(predicate.apply("bar"));
        assertTrue(predicate.apply("foo"));
        assertTrue(predicate.apply("foobar"));
    }
}