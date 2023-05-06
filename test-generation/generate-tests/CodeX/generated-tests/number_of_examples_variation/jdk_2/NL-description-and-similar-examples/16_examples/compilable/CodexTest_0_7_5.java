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


public class CodexTest_0_7_5 { 
  @Test
    public void testContains() {
        Vector v3 = new Vector();
        assertTrue(v3.contains(null));
        assertTrue(v3.contains(""));
        assertTrue(v3.contains("one"));
        assertTrue(v3.contains("two"));
        assertTrue(v3.contains("three"));
        assertFalse(v3.contains(new Object()));
    }
}