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


public class CodexTest_0_8_54 { 
  @Test
    public void testRemove() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("foo");
        lst.add("bar");
        String s = lst.remove(0);
        assertEquals("foo", s);
        assertEquals(1, lst.size());
        assertEquals("bar", lst.get(0));
    }
}