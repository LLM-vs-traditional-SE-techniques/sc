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


public class CodexTest_0_9_36 { 
  @Test
    public void testContains() {
        int size = values.length;
        for (int i = 0; i < size; ++i) {
            assertTrue("List should contain " + values[i],
                    l.contains(values[i]));
        }
}