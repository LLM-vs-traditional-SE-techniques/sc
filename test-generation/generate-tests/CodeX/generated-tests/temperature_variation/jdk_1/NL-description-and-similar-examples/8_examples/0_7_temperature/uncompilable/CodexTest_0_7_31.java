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


public class CodexTest_0_7_31 { 
  @Test
    public void testSetValueBigArray() {
        final int[] source = new int[] {1, 2, 3};
        final int[] target = new int[10];
        final int[] indices = new int[] {0, 1, 2};
        final int[] expected = new int[] {1, 2, 3, 0, 0, 0, 0, 0, 0, 0};
        ArrayMath.set(target, indices, source);
        Assert.assertArrayEquals(expected, target);
    }
}