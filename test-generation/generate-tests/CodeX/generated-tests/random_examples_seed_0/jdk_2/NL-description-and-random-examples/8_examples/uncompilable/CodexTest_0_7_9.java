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


public class CodexTest_0_7_9 { 
    @Test
    public void testContains() {
        Assert.assertFalse(list.contains(d));
        Assert.assertTrue(list.contains(c));
        Assert.assertTrue(list.contains(null));
        Assert.assertFalse(list.contains(0.0));
    }
}