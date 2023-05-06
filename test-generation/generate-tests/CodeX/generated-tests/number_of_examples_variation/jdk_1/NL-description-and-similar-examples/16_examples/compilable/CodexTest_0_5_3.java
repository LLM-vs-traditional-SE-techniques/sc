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


public class CodexTest_0_5_3 { 
  @Test
    public void testListIteratorRemove() {
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        ListIterator<String> i = list.listIterator();
        i.next();
        i.remove();
        assertEquals(Arrays.asList("B", "C", "D", "E"), list);
        assertEquals("B", i.next());
        assertEquals("C", i.next());
        i.remove();
        assertEquals(Arrays.asList("B", "D", "E"), list);
    }
}