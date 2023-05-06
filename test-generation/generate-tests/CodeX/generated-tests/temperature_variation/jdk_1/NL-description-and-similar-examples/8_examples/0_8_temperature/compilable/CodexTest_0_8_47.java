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


public class CodexTest_0_8_47 { 
  @Test
  public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I"));
        String s = list.remove(2);
        assertEquals(s, "C");
        assertTrue(list.containsAll(Arrays.asList("A", "B", "D", "E", "F", "G", "H", "I")));
        assertTrue(Arrays.asList("A", "B", "D", "E", "F", "G", "H", "I").containsAll(list));
    }
}