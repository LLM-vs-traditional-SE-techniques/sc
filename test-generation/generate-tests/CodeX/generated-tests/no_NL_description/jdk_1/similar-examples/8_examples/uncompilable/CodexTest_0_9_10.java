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


public class CodexTest_0_9_10 { 
  @Test
  public void testRemove() {
        final String obj = new String("a");
        final StringCollection col = new StringCollection();
        col.add(obj);
        col.add(new String("b"));
        col.add(new String("c"));
        col.add(new String("d"));
        col.add(new String("e"));
        assertTrue(col.contains(obj));
        assertSame(obj, col.remove(obj));
        assertFalse(col.contains(obj));
        assertSame("b", col.remove(0));
        assertSame("e", col.remove(col.size() - 1));
        assertSame("c", col.remove(0));
        assertSame("d", col.remove(col.size() - 1));
        assertTrue(col.isEmpty());
    }
}