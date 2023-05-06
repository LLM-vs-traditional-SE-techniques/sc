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


public class CodexTest_0_6_57 { 
  @Test
   public void testRemoveAtIndex() {
        IndexedObjects objects = new IndexedObjects();
        objects.add("foo");
        objects.add("bar");
        objects.add("baz");
        assertEquals("foo", objects.remove(0));
        assertEquals("bar", objects.remove(0));
        assertEquals("baz", objects.remove(0));
        assertEquals(0, objects.size());
    }
}