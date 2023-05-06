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


public class CodexTest_0_9_67 { 
  @Test
    public void testContains() {
        Collection<String> c = new ArrayList<String>();
        assertEquals(false, c.contains(null));
        c.add("one");
        assertEquals(false, c.contains(null));
        assertEquals(false, c.contains("two"));
        assertEquals(true, c.contains("one"));
    }
}