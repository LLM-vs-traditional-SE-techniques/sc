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


public class CodexTest_0_5_78 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals(list.remove(1), "bar");
        assertEquals(list.size(), 2);
        assertEquals(list.get(0), "foo");
        assertEquals(list.get(1), "baz");
    }
}