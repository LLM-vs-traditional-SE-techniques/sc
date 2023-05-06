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


public class CodexTest_0_8_5 { 
  @Test
    public void testRemoveIf() {
        // Test-driver for removeIf(Predicate).
        List<Integer> src = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            src.add(i);
        Set<Integer> toRemove = new HashSet<>();
        for (int i = 3; i <= 7; i++)
            toRemove.add(i);
        for (int i = 11; i <= 14; i++)
            toRemove.add(i);
        for (int i = 17; i <= 17; i++)
            toRemove.add(i);
}