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


public class CodexTest_0_4_8 { 
  @Test
    public void testRemove() {
        final int size = 3;
        final Object[] es = new Object[size];
        es[0] = "foo";
        es[1] = "bar";
        es[2] = "baz";
        assertEquals(es[0], list.remove(0));
        assertEquals(es[1], list.remove(0));
        assertEquals(es[2], list.remove(0));
    }
}