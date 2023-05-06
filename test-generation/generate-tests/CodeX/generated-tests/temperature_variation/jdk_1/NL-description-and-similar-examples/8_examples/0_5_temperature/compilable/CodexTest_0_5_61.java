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


public class CodexTest_0_5_61 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.remove(2);
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("d", list.get(2));
        assertEquals("e", list.get(3));
        assertEquals(4, list.size());
    }
}