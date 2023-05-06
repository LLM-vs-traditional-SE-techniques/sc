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


public class CodexTest_0_7_59 { 
  @Test
    public void testContains() {
        Object[] testObjects = {null, new Object(), new Object()};
        for (int i = 0; i < testObjects.length; i++) {
            assertFalse(testSet.contains(testObjects[i]));
        }
        for (int i = 0; i < testObjects.length; i++) {
            testSet.add(testObjects[i]);
            assertTrue(testSet.contains(testObjects[i]));
        }
    }
}