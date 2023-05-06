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


public class CodexTest_0_8_6 { 
  @Test
    public void testContainsObject() {
        List<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        assertTrue(a.contains("a"));
        assertTrue(a.contains("b"));
        assertFalse(a.contains("c"));
        a.add(null);
        assertTrue(a.contains(null));
        assertFalse(a.contains(new Object()));
    }
}