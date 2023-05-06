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


public class CodexTest_0_9_49 { 
  @Test
        public void testRemoveByElement() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("" + i);
        }
        Random rand = new Random();
        for (int i = 0; i < list.size(); ) {
            int item = rand.nextInt(list.size());
            if (item % 2 == 0) {
                list.remove("" + item);
                assertEquals("" + item, false, list.contains("" + item));
            } else {
                assertEquals("" + item, true, list.contains("" + item));
                i++;
            }
        }
        assertEquals("Incorrect size", 50, list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals("" + i, false, list.contains("" + i));
        }
    }
}