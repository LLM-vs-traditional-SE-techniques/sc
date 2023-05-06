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


public class CodexTest_0_7_3 { 
  @Test
    public void testRemove() throws Exception {
        final AtomicInteger count = new AtomicInteger();
        DynamicList<Integer> list = DynamicList.of(1, 2, 3);
        list.addListener(new ListEventListener<Integer>() {
            @Override
            public void onChanged(ListEvent<Integer> event) {
                count.incrementAndGet();
                assertEquals(1, event.getIndex());
                assertEquals(2, (int) event.getRemoved().get(0));
            }
        });
        assertEquals((Integer) 2, list.remove(1));
        assertEquals(1, count.get());
        assertEquals(Arrays.asList(1, 3), list);
    }
}