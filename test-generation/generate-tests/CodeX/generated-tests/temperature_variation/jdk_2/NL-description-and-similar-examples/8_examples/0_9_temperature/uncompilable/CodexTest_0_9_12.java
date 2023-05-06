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


public class CodexTest_0_9_12 { 
  @Test
    public void testContainsAll() {
        // Test to ensure the containsAll() method obeys the general
        // contract of Collection.containsAll(). Test containsAll() with
        // a collection that has the same elements, in the same order,
        // as the set.
        HashSet hs = new HashSet();
        for (int counter = 0; counter < hash_obj.length; counter++) {
            hs.add(hash_obj[counter]);
        }
}