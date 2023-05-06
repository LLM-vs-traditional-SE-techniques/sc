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


public class CodexTest_0_6_8 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("three");
        list.add("four");
        list.add("four");
        list.add("four");
        list.add("five");
        list.remove(1);
        assertEquals("two", list.get(1));
        list.remove(0);
        assertEquals("three", list.get(0));
        list.remove(4);
        assertEquals("five", list.get(4));
    }
}