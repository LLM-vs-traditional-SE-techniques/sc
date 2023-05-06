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


public class CodexTest_0_6_1 { 
  @Test
    public void testIndexOf() {
        final int[] values = {-2, -1, 0, 1, 2, 3, 4};
        final Object[] objects = new Object[values.length];
        for (int i = 0; i < values.length; i++) {
            objects[i] = new Integer(values[i]);
        }
        final ArrayList list = new ArrayList(objects.length);
        for (int i = 0; i < objects.length; i++) {
            list.add(objects[i]);
        }
        for (int i = 0; i < objects.length; i++) {
            assertEquals(i, list.indexOf(objects[i]));
        }
    }
}