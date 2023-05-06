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


public class CodexTest_0_8_56 { 
  @Test
    public void testContainsObject() {
        assertTrue(BooleanArray.wrap(true, false, true).contains(Boolean.TRUE));
        assertTrue(BooleanArray.wrap(true, false, true).contains(Boolean.FALSE));
        assertTrue(BooleanArray.wrap(true, true).contains(Boolean.TRUE));
        assertFalse(BooleanArray.wrap(true, true).contains(Boolean.FALSE));
        assertFalse(BooleanArray.wrap(false, false).contains(Boolean.TRUE));
        assertTrue(BooleanArray.wrap(false, false).contains(Boolean.FALSE));
        assertFalse(BooleanArray.wrap(true).contains(Boolean.FALSE));
        assertTrue(BooleanArray.wrap(true).contains(Boolean.TRUE));
        assertFalse(BooleanArray.wrap(false).contains(Boolean.TRUE));
        assertTrue(BooleanArray.wrap(false).contains(Boolean.FALSE));
        assertFalse(BooleanArray.wrap().contains(Boolean.TRUE));
        assertFalse(BooleanArray.wrap().contains(Boolean.FALSE));
        assertFalse(BooleanArray.wrap().contains("foobar"));
    }
}