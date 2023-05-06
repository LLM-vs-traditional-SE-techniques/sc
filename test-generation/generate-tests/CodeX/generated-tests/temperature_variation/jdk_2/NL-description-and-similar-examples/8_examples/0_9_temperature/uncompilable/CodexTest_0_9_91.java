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


public class CodexTest_0_9_91 { 
  @Test
    public void testContainsAll() {
        ZSet zset = redis.getZSet("test");
        List<String> values = zset.range(0, 3);
        zset.add("a", 10);
        zset.add("b", 0);
        zset.add("c", -10);
        assertTrue(zset.containsAll(values));
        assertTrue(zset.size() == 4);
        assertTrue(zset.contains("a"));
        assertTrue(zset.contains("b"));
        assertTrue(zset.contains("c"));
    }
}