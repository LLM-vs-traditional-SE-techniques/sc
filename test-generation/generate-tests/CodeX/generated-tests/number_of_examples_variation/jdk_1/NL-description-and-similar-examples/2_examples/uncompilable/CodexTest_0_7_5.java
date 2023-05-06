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


public class CodexTest_0_7_5 { 
  @Test
        public void testAddAll() {
            List<Object> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
            List<Object> list2 = new ArrayList<>();
            list2.add("0");
            list2.add("1");
            list2.add("2");
            list2.add("3");
            list2.add("4");
            list2.add("5");
            list.remove(1);
            assertTrue(list.get(1) == "c");
        }
```
}