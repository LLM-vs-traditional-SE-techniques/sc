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


public class CodexTest_0_8_3 { 
  @Test
    public void testContainsObject() {
        Vector2D v = new Vector2D(2, 3);
        Assert.assertTrue(v.contains(new SparseObjectVector(new Object[] {new Vector1D(2), new Vector1D(3)})));
        Assert.assertFalse(v.contains(new SparseObjectVector(new Object[] {new Vector1D(2), new Vector1D(4)})));
    }
}