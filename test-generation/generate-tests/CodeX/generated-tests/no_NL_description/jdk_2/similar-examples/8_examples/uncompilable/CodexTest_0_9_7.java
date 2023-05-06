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


public class CodexTest_0_9_7 { 
  @Test
    public void testContainsWithNullHashCodeObject() {
        Set<Object> set = newLinkedHashSet();
        set.add(new TestNullHashCodeObject("one"));
        set.add(new TestNullHashCodeObject("two"));
        assertTrue("Expected the collection to contain an instance of TestNullHashCodeObject for name \"one\"",
                set.contains(new TestNullHashCodeObject("one")));
        assertTrue("Expected the collection to contain an instance of TestNullHashCodeObject for name \"two\"",
                set.contains(new TestNullHashCodeObject("two")));
        assertFalse("Expected the collection to not contain an instance of TestNullHashCodeObject for name \"three\"",
                set.contains(new TestNullHashCodeObject("three")));
    }
}