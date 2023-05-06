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


public class CodexTest_0_3_5 { 
    @Test
    public void testRemove() {
        Object[] data = new Object[] {a, b, c, d, e, f, g, h, i, j, k};
        List<Object> list = new ArrayList<>(Arrays.asList(data));
        Object[] expected = new Object[] {a, b, c, d, e, f, g, h, i, j, k};
        Object[] expectedAfterRemove = new Object[] {a, b, c, d, e, f, g, h, i};
        assertEquals(expected, list.toArray());
        assertEquals(k, list.remove(10));
        assertEquals(expectedAfterRemove, list.toArray());
    }
}