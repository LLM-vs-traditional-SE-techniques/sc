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


public class CodexTest_0_5_2 { 
  @Test
    public void testRemove() {
        Vector<String> v = new Vector<String>();
        v.add("one");
        v.add("two");
        v.add("three");
        v.add("four");
        v.add("five");
        v.remove(3);
        assertEquals(4, v.size());
        assertEquals("one", v.get(0));
        assertEquals("two", v.get(1));
        assertEquals("three", v.get(2));
        assertEquals("five", v.get(3));
    }
}