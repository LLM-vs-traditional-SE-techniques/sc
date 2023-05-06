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


public class CodexTest_0_6_68 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertSame(list.remove(2), "c");
        assertEquals(2, list.size());
        assertSame(list.remove(1), "b");
        assertEquals(1, list.size());
        assertSame(list.remove(0), "a");
        assertEquals(0, list.size());
    }
}