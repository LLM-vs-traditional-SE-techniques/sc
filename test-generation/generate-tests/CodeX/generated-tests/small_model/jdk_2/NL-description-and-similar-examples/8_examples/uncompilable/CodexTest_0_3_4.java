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


public class CodexTest_0_3_4 { 
  @Test
    public void testContains() {
        assertTrue(new AlgVector(new double[] {1, 2, 3}).contains(1));
        assertTrue(new AlgVector(new double[] {1, 2, 3}).contains(2));
        assertTrue(new AlgVector(new double[] {1, 2, 3}).contains(3));
        assertFalse(new AlgVector(new double[] {1, 2, 3}).contains(4));
        assertFalse(new AlgVector(new double[] {1, 2, 3}).contains(0));
    }
}