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


public class CodexTest_0_7_43 { 
  @Test
    public void test_remove_int() {
        int size = list.size();
        // check the boundaries
        Object obj = list.remove(0);
        assertEquals("Failed to remove first element", obj, list.get(0));
        assertEquals("Failed to decrement size after remove first element",
                size - 1, list.size());
        obj = list.remove(list.size() - 1);
        assertEquals("Failed to remove last element", obj, list.get(list.size() - 1));
        assertEquals("Failed to decrement size after remove last element",
                size - 2, list.size());
        // now remove an element in the middle
        obj = list.remove(list.size() / 2);
        assertEquals("Failed to remove element in middle", obj,
                list.get(list.size() / 2));
        assertEquals("Failed to decrement size after remove element in middle",
                size - 3, list.size());
    }
}