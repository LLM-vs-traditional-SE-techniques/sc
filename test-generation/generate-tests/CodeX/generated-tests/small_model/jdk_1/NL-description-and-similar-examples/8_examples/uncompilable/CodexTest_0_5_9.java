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


public class CodexTest_0_5_9 { 
  @Test
        @Override
        public void testFastRemove() {
            int size = RandomUtils.nextInt(20);
            List<Object> l = new ArrayList<Object>(size);
            for (int i = 0; i < size; i++) {
                l.add(new Object());
            }
            int index = RandomUtils.nextInt(size);
            assertEquals(l.remove(index), l.fastRemove(index));
        }
}