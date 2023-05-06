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


public class CodexTest_0_9_3 { 
  @Test
    public void testIndexOfAndLastIndexOfNull() {
    List<String> list = new ArrayList<String>();
        list.add(null);
        list.add("foo");
        //check for the index of the first null
        Assert.assertTrue(list.indexOf(null) == 0);
        //and last occurrence
        Assert.assertTrue(list.lastIndexOf(null) == 0);    
    //now remove it and test again
    list.remove(null);
    }
}