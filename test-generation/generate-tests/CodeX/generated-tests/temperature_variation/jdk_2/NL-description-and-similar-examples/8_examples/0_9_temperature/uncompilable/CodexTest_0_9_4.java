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


public class CodexTest_0_9_4 { 
  @Test
    public void testContainsSingleArg() {
        if (modCount != l.modCount)
            assertTrue(false);
        int[] values = {white, 11, 12, 13, 14, 20, 30, white};
        MyList list = new MyList(values);
        for (int i = 0; i < values.length; i++)
            if (list.contains(values[i])) {
                list.remove(list.indexOf(values[i]));
                list.remove(i--);
            }
        assertTrue("Empty list should be empty", list.isEmpty());
    }
}