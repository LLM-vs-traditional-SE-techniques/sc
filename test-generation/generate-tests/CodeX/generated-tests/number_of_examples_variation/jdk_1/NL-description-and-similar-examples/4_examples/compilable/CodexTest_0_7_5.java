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


public class CodexTest_0_7_5 { 
  @Test
    public void testRemove() {
        Object[] data = new Object[]{"1", "2", "3"};
        List<Object> list = new ArrayList<Object>(Arrays.asList(data));
        assertEquals("1", list.remove(0));
        assertEquals("3", list.remove(1));
        assertEquals("2", list.remove(0));
    }
}