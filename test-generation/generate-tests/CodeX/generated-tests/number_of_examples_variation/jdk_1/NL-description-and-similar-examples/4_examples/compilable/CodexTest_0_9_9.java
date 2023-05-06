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


public class CodexTest_0_9_9 { 
  @Test
        public void testRemoveValidElementFromMiddleOfTheArrayAndShiftTheElements()
        {
                final int size = 8;
                final int indexToRemove = size / 2;
                Object[] array = new Object[size];
                int index = 0;
                while (index < indexToRemove)
                {
                        array[index] = new Object();
                        index++;
                }
                Object object = new Object();
                array[index] = object;
                int expectedIndex = index + 1;
                index++;
                while (index < size)
                {
                        array[index] = new Object();
                        index++;
                }
                List<Object> list = new ArrayList<Object>(Arrays.asList((Object[]) array));
                list.remove(indexToRemove);
                assertEquals("Old object should be returned.", object, array[indexToRemove]);
                Object[] arrayAfterRemoval = list.toArray();
                assertEquals("The size of the array should be decreased.", size - 1, arrayAfterRemoval.length);
                index = 0;
                while (index < indexToRemove)
                {
                        assertEquals("From first to removed element: element at index " + index + " should be the same as organization element at index " + index + ".", array[index], arrayAfterRemoval[index]);
                        assertEquals("From first to removed element: element at index " + index + " should be the same as organization element at index " + index + ".", arrayAfterRemoval[index], list.get(index));
                        index++;
                }
                while (index < size - 1)
                {
                        assertEquals("From removed to last element: element at index " + index + " should be the same as organization element at index " + expectedIndex + ".", array[expectedIndex], arrayAfterRemoval[index]);
                        assertEquals("From removed to last element: element at index " + index + " should be the same as organization element at index " + expectedIndex + ".", arrayAfterRemoval[index], list.get(index));
                        index++;
                        expectedIndex++;
                }
        }

}