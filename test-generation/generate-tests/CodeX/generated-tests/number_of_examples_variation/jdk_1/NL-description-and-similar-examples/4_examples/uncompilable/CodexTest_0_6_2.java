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


public class CodexTest_0_6_2 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(0, list.get(0));
        assertEquals(2, list.get(1));
    }
}