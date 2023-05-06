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


public class CodexTest_0_5_6 { 
  @Test
    public void testRemoveElementAtIndex() {
        String[] array = new String[] {"a", "b", "c", "d", "e"};
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        assertEquals("b", list.remove(1));
        assertEquals(Arrays.asList("a", "c", "d", "e"), list);
        assertEquals("e", list.remove(list.size() - 1));
        assertEquals(Arrays.asList("a", "c", "d"), list);
        assertEquals("a", list.remove(0));
        assertEquals(Arrays.asList("c", "d"), list);
    }
}