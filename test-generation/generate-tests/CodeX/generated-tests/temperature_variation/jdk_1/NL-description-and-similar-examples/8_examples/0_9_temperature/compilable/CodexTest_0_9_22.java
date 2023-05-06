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


public class CodexTest_0_9_22 { 
  @Test
    public void testSetAndGet() {
        Random random = new Random(System.currentTimeMillis());
        List<Object> list = new ArrayList<Object>(random.nextInt(10));
        for (int i = 0; i < list.size(); i++) {
            Object value = new Object();
            list.set(i, value);
            assertEquals(value, list.get(i));
        }
    }
}