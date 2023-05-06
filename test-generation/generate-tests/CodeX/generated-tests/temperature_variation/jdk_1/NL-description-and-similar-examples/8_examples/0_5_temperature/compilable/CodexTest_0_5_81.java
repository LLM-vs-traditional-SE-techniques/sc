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


public class CodexTest_0_5_81 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        String removed = list.remove(1);
        assertEquals("b", removed);
        assertEquals(Arrays.asList("a", "c"), list);
    }
}