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


public class CodexTest_0_9_2 { 
    /**
     * Exercise the test case for remove method.
     *
     */
    @Test
    public void testRemove() {
        List<String> li = new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        li.add("five");
        //obj.remove(index);
        li.remove(0);
        assertEquals("two", li.get(0));
        li.remove(2);
        assertEquals("five", li.get(1));
        li.remove(1);
        assertEquals("three", li.get(1));
    }
}