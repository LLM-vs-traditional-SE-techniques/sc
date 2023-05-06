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


public class CodexTest_0_9_87 { 
  @Test
    public void testContainsNull() {
        String[] values = new String[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            values[i] = String.valueOf(i);
        }
        ArrayIterator<String> iter = new ArrayIterator(values);
        iter.next();
}