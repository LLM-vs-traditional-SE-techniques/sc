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


public class CodexTest_0_4_7 { 
  @Test
    public void testContains() {
        Collection<String> coll = createTestCollection();
        assertTrue(coll.contains(new String("1")));
        assertTrue(coll.contains(new String("2")));
        assertTrue(coll.contains(new String("3")));
        assertTrue(coll.contains(new String("4")));
        assertTrue(coll.contains(new String("5")));
        assertTrue(coll.contains(new String("6")));
        assertFalse(coll.contains(new String("7")));
        assertFalse(coll.contains(new String("8")));
        assertFalse(coll.contains(new String("9")));
        assertFalse(coll.contains(new String("10")));
        assertFalse(coll.contains(new String("11")));
    }
}