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


public class CodexTest_0_8_8 { 
  @Test
    public void test_remove_all() {
        Assert.assertEquals(10, mockList.size());
        Assert.assertEquals("element 0", mockList.remove(0));
        Assert.assertEquals(9, mockList.size());
        Assert.assertEquals("element 7", mockList.remove(7));
        Assert.assertEquals(8, mockList.size());
        Assert.assertEquals("element 5", mockList.remove(5));
        Assert.assertEquals(7, mockList.size());
        // We are removing elements from a "live" list (elements are removed
        // from the backing array). Hence we need to correct our index values.
        Assert.assertEquals("element 8", mockList.remove(3));
        Assert.assertEquals(6, mockList.size());
        Assert.assertEquals("element 6", mockList.remove(2));
        Assert.assertEquals(5, mockList.size());
    }
}