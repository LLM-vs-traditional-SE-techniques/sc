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


public class CodexTest_0_7_61 { 
  @Test
    public void testRemove() throws Exception {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 100; i += 2) {
            assertEquals(Integer.valueOf(i), list.remove(i));
        }
        assertEquals(50, list.size());
        for (int i = 0; i < 50; i++) {
            assertEquals(Integer.valueOf(i * 2 + 1), list.get(i));
        }
    }
}