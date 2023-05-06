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


public class CodexTest_0_8_62 { 
  @Test
        public void testRemove() {
        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(1,2,3));
        Integer first = l.remove();
        Integer second = l.remove();
        assertEquals(new Integer(1), first);
        assertEquals(new Integer(2), second);
        assertEquals(Arrays.asList(3), l);
    }
}