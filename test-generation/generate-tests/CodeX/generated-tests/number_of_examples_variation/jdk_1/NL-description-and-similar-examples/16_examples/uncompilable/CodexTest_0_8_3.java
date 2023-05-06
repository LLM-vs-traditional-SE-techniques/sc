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


public class CodexTest_0_8_3 { 
  @Test
    public void testRemoveObject1() {
        assertSame(this, list.remove(0));
        assertEquals(3, list.size());
        assertEquals(weak(object1), list.get(0));
        assertSame(strong(object2), list.get(1));
        assertSame(strong(object3), list.get(2));
    }
    public void testRemoveObject3() {
        assertSame(strong(object3), list.remove(2));
        assertEquals(2, list.size());
        assertEquals(this, list.get(0));
        assertEquals(weak(object1), list.get(1));
    }
}