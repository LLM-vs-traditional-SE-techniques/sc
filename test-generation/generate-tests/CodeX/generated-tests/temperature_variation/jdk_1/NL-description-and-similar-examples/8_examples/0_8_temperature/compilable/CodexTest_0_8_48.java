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


public class CodexTest_0_8_48 { 
  @Test
    public void testRemoveRange() {
        Object[] data = new Object[] { null, "", "bat", "cat" };
        List list = new ArrayList();
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        list.remove(1);
        assertEquals(Arrays.asList(data).subList(1, data.length), list);
    }
}