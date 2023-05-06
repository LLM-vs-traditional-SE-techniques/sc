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


public class CodexTest_0_9_2 { 
  @Test
    public void testContains() {
        Arrays.asList(new Object[] { "one", "two" }).contains("oox");
        assertFalse("foo".contentEquals("foo"));
        assertFalse("foo".contentEquals("oox"));
        assertTrue("one".contentEquals("one"));
    }
    public void testPadding() {
        byte[] b = new byte[5];
        assertEquals("Value mismatch for padding [13]", 1, Integer.parseInt(new String(b, BaseEncoding.base16().lowerCase()).substring(b.length-2)));
    }
}