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


public class CodexTest_0_7_90 { 
  @Test
    public void testContains() {
        Collection<Object> c = new ArrayList<Object>();
        c.add("abc");
        c.add("def");
        c.add("ghi");
        c.add("jkl");
        assertTrue("contains(def)", c.contains("def"));
        assertTrue("contains(\"def\")", c.contains("def"));
        assertTrue("contains(new String(\"def\"))", c.contains(new String("def")));
        assertFalse("contains(\"xyz\")", c.contains("xyz"));
        assertFalse("contains(new String(\"xyz\"))", c.contains(new String("xyz")));
    }

}