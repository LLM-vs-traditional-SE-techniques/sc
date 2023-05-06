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


public class CodexTest_0_9_19 { 
  @Test
        public void testContainsObject() {
            Vector<Object> v = populate5();
            assertTrue(v.contains(1));
            assertTrue(v.contains(2));
            assertTrue(v.contains(3));
            assertTrue(v.contains(4));
            assertTrue(v.contains(5));
            assertFalse(v.contains(6));
        }
}