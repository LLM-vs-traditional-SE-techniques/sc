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


public class CodexTest_0_4_77 { 
  @Test
    public void testRemove() {
        Object[] data = new Object[] { "1", "2", "3", "4", "5", "6" };
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(data));
        list.remove(0);
        assertEquals(Arrays.asList(data).subList(1, data.length), list);
        list.remove(list.size() - 1);
        assertEquals(Arrays.asList(data).subList(1, data.length - 1), list);
        list.remove(1);
        assertEquals(Arrays.asList(data).subList(1, data.length - 1).subList(0, 1)
                .concatenate(Arrays.asList(data).subList(1, data.length - 1).subList(2, 3)), list);
    }
}