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


public class CodexTest_0_9_62 { 
  @Test
    public void testContains() {
        Object[] os1 = new Object[100];
        final Object o1 = new Object();
        // should be in
        os1[50] = o1;
        assertTrue(ArrayUtils.contains(os1, o1));
        // should not be in
        assertFalse(ArrayUtils.contains(os1, new Object()));
}