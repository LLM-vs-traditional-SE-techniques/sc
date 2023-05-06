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


public class CodexTest_0_5_5 { 
    @Test
    public void testContains() {
        Assert.assertTrue(new DoubleArrayList(new double[] {1.0, 2.0, 3.0}).contains(1.0));
        Assert.assertTrue(new DoubleArrayList(new double[] {1.0, 2.0, 3.0}).contains(2.0));
        Assert.assertTrue(new DoubleArrayList(new double[] {1.0, 2.0, 3.0}).contains(3.0));
        Assert.assertFalse(new DoubleArrayList(new double[] {1.0, 2.0, 3.0}).contains(0.0));
        Assert.assertFalse(new DoubleArrayList(new double[] {1.0, 2.0, 3.0}).contains(4.0));
    }
}