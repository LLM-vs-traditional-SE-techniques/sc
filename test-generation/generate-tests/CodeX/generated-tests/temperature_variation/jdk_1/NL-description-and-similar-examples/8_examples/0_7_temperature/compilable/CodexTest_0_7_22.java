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


public class CodexTest_0_7_22 { 
  @Test
        public void testRemove() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        String[] sa = new String[l.size()];
        l.toArray(sa);
        assertEquals(sa[0], "a");
        assertEquals(sa[1], "b");
        assertEquals(sa[2], "c");
        assertEquals(sa[3], "d");
        assertEquals(sa[4], "e");
        assertEquals(sa[5], "f");
        String r = l.remove(3);
        assertEquals("d", r);
        sa = new String[l.size()];
        l.toArray(sa);
        assertEquals(sa[0], "a");
        assertEquals(sa[1], "b");
        assertEquals(sa[2], "c");
        assertEquals(sa[3], "e");
        assertEquals(sa[4], "f");
    }
}