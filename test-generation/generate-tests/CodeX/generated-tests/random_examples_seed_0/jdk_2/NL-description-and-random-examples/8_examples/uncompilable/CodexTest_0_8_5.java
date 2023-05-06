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
    public void testContains() {
        final Interval interval = new Interval(new Vector1D(0), new Vector1D(10));
        Assert.assertTrue(interval.contains(new Vector1D(0)));
        Assert.assertTrue(interval.contains(new Vector1D(10)));
        Assert.assertTrue(interval.contains(new Vector1D(5)));
        Assert.assertFalse(interval.contains(new Vector1D(-1)));
        Assert.assertFalse(interval.contains(new Vector1D(11)));
    }
}