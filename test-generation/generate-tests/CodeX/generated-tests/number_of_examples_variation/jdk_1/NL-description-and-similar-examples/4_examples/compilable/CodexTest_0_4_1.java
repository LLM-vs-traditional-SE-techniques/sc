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


public class CodexTest_0_4_1 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        assertEquals("a", list.remove(0));
        assertEquals(3, list.size());
        assertEquals("b", list.get(0));
        assertEquals("c", list.get(1));
        assertEquals("d", list.get(2));
    }
}