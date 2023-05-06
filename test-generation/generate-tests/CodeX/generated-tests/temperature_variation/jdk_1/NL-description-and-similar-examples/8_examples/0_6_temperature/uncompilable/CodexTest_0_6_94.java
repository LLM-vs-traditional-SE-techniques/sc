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


public class CodexTest_0_6_94 { 
  @Test
    public void testRemove_Object_NullElement() {
        // Test for method boolean java.util.ArrayList.remove(java.lang.Object)
        Object o = new Object();
        list.add(0, null);
        list.add(1, o);
        list.add(2, null);
        assertTrue("Removing null failed", list.remove(null));
        assertTrue("Removing null failed", list.remove(null));
        assertTrue("Removing element failed", list.remove(o));
        assertTrue("List should be empty", list.isEmpty());
    }
}