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


public class CodexTest_0_7_68 { 
  @Test
    public void testContainsAll() {
        Set<String> a = new HashSet<String>();
        a.add("value1");
        a.add("value2");
        a.add("value3");
        Set<String> b = new HashSet<String>();
        b.add("value1");
        b.add("value2");
        b.add("value3");
        b.add("value4");
        assertTrue(b.containsAll(a));
    }
}