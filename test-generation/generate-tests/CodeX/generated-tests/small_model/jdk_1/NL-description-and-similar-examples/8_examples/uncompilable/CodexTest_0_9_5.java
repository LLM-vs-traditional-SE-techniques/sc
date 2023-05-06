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


public class CodexTest_0_9_5 { 
  @Test
    public void testCollectionsStream() {
        List<Integer> values = Arrays.asList(1, 2, 3);
        AtomicInteger count = new AtomicInteger();
        values.stream().forEach((v) -> {
            count.incrementAndGet();
        });
        assertEquals(values.size(), count.get());
    }
}