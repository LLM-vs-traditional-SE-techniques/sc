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


public class CodexTest_0_9_64 { 
  @Test
     public void testContainsObject() {
        assertTrue(instanceUnderTest.contains(Integer.valueOf(3)));
        assertFalse(instanceUnderTest.contains(Integer.valueOf(1000)));
        unmodifiableCollection.contains(Integer.valueOf(3));
        try {
            unmodifiableCollection.contains(Integer.valueOf(1000));
            fail();
        } catch (UnsupportedOperationException expected) {
        }
    }
}