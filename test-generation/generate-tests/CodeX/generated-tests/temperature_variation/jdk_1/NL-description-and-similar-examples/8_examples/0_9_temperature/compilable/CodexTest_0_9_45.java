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


public class CodexTest_0_9_45 { 
  @Test
    public void removeAscendingValues() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "test" + i);
        }
        for (int i = 0; i < 10; i++) {
            map.remove(i);
            assertEquals(10 - i - 1, map.size());
        }
    }
}