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


public class CodexTest_0_3_6 { 
  @Test
    public void testContains() {
        assertTrue("contains", c.contains(new Integer(8)));
        assertTrue("contains", !c.contains(new Integer(3)));
        Set s = new HashSet();
        s.add(null);
        assertTrue("contains null", !c.contains(null));
        c.add(null);
        assertTrue("contains null", c.contains(null));
        List l = new LinkedList();
        l.add(null);
        assertTrue("contains null", !c.containsAll(l));
        l.add("one");
        assertTrue("contains null", !c.containsAll(l));
        l.add("two");
        assertTrue("contains null", !c.containsAll(l));
        l.add("three");
        assertTrue("contains null", c.containsAll(l));
    }
}