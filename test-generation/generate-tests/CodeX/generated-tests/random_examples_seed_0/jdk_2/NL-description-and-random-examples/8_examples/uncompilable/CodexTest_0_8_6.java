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


public class CodexTest_0_8_6 { 
  @Test
    public void testContains() {
        DenseIntMatrix1D d1enseIntMatrix1D = new DenseIntMatrix1D(new int[]{1, 2, 3});
        Assert.assertTrue(d1enseIntMatrix1D.contains(2));
        Assert.assertFalse(d1enseIntMatrix1D.contains(5));
    }

}