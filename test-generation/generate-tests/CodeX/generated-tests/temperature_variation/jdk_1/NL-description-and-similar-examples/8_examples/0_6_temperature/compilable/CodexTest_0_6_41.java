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


public class CodexTest_0_6_41 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        assertEquals("B", list.remove(1));
        assertEquals("A", list.get(0));
        assertEquals(1, list.size());
    }
}