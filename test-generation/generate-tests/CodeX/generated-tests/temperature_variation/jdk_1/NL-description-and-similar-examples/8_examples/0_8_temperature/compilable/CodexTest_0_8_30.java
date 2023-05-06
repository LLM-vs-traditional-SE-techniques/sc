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


public class CodexTest_0_8_30 { 
  @Test
    public void testRemoveIndex() {
        Integer[] data = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(data));
        assertEquals(data[0], list.remove(0));
        assertEquals(data[2], list.remove(1));
        assertEquals(data[1], list.remove(0));
        assertTrue("Remove did not clear list", list.isEmpty());
     }
}