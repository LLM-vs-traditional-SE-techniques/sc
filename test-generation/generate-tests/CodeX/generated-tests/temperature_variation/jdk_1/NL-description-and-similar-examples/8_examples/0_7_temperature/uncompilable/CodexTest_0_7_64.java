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


public class CodexTest_0_7_64 { 
  @Test
    public void testRemoveIndex() {
        array.add("first");
        array.add("second");
        array.add("third");
        array.add("fourth");
        array.add("fifth");
        array.add("sixth");
        array.add("seventh");
        array.add("eighth");
        Assert.assertEquals("first", array.remove(0));
        Assert.assertEquals("eighth", array.remove(6));
        Assert.assertEquals("fifth", array.remove(3));
        Assert.assertEquals(5, array.size());
    }
}