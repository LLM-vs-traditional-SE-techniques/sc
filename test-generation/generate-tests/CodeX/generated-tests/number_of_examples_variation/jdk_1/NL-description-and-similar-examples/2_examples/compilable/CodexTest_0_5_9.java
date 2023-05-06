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


public class CodexTest_0_5_9 { 
  @Test
    public void testRemoveAt() {
        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals("bar", list.remove(1));
        assertEquals("[foo, baz]", list.toString());
        assertEquals("baz", list.remove(1));
        assertEquals("[foo]", list.toString());
        assertEquals("foo", list.remove(0));
        assertEquals("[]", list.toString());
    }
}