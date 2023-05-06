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


public class CodexTest_0_8_66 { 
  @Test
    public void testContainsShouldReturnTrueWhenItemInCollectionGiven() {
        // given
        List<String> collection = new ArrayList<String>();
        collection.add("test");
        // when
        boolean result = collection.contains("test");
        // then
        assertTrue(result);
    }
}