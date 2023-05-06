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


public class CodexTest_0_8_42 { 
  @Test
    public void testContains() {
        assertTrue(arrayList.contains(null));
        assertTrue(arrayList.contains(new Integer(0)));
        assertTrue(arrayList.contains(new Integer(1)));
        assertTrue(arrayList.contains(new Integer(7)));
        assertTrue(arrayList.contains(new Integer(99)));
        assertFalse(arrayList.contains(new Integer(-1)));
        assertFalse(arrayList.contains(new Integer(100)));
    }
}