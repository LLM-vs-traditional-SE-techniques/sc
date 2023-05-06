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


public class CodexTest_0_9_69 { 
  @Test
        public void removeRangeRemovesCorrectly() {
            final int testSize = 12;
            final int itemOffset = 2;
            final int removeSize = 4;
            Integer[] testArray = toArray(createIntArray(testSize));
            Integer[] removedItems = createIntArray(removeSize);
            List<Integer> testList = new ArrayList<>(testSize);
            testList.addAll(Arrays.asList(testArray));
            List<Integer> itemsToRemove = new ArrayList<>(removeSize);
            itemsToRemove.addAll(Arrays.asList(removedItems));
            testList.addAll(itemsToRemove);
            Collections.sort(testList);
            testList.subList(itemOffset, itemOffset + removeSize).clear();
            Integer[] expected = toArray(testList);
            System.arraycopy(testArray, 0, removedItems, 0, testSize);
            ArrayList<Integer> al = new ArrayList<>(Arrays.asList(testArray));
            al.removeRange(itemOffset, itemOffset + removeSize);
            Integer[] actual = toArray(al);
            Assert.assertArrayEquals(expected, actual);
        }
}