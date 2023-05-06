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


public class CodexTest_0_6_62 { 
  @Test
  public void testContains() {
        Vector<String> v = new Vector<String>();
        assertFalse(v.contains("xyz"));
        assertFalse(v.contains(null));
        v.add(null);
        assertTrue(v.contains(null));
        assertFalse(v.contains("xyz"));
        v.add("xyz");
        assertTrue(v.contains(null));
        assertTrue(v.contains("xyz"));
    }
}