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


public class CodexTest_0_4_8 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        String removed = list.remove(2);
        assertEquals("3", removed);
        assertEquals(Arrays.asList("1", "2", "4", "5"), list);
    }
}