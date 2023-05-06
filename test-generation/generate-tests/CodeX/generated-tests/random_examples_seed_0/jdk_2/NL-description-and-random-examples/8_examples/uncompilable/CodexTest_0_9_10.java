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


public class CodexTest_0_9_10 { 
  @Test
    public void testContains() {
        Vector1D v1 = new Vector1D(1);
        Assert.assertTrue(new Vector1D(1).equals(v1));
        Assert.assertTrue(v1.equals(new Vector1D(1)));
        Assert.assertFalse(new Vector1D(0).equals(v1));
        Assert.assertFalse(v1.equals(new Vector1D(0)));
        Assert.assertFalse(new Vector1D(0).equals(null));
    }
}