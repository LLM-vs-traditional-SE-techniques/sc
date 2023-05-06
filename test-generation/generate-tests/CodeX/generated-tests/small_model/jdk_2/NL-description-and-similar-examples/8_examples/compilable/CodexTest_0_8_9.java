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


public class CodexTest_0_8_9 { 
  @Test
    public void testtoString() {
        assertEquals("[1, 2]", Arrays.toString(new int[] {1, 2}));
        assertEquals("[1.2, 2.3]", Arrays.toString(new double[] {1.2, 2.3}));
        assertEquals("[1, 2]", Arrays.toString(new Object[] {1, 2}));
        assertEquals("[1.0, 2.0]", Arrays.toString(new float[] {1.0f, 2.0f}));
    }
}