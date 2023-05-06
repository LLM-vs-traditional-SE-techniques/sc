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


public class CodexTest_0_7_1 { 
  @Test
    public void testAdd(){
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(1);
        ar1.add(5);
        ar1.add(6);
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        ar2.add(2);
        ar2.add(3);
        ar2.add(6);
        ar2.add(7);
        ar2.add(8);
        Integer[] array = new Integer[ar1.size() + ar2.size()];
        int k = 0;
        for (Integer i : ar1) {
            array[k++] = i;
        }
        for (Integer i : ar2) {
            array[k++] = i;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                array[i] = null;
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                result.add(array[i]);
            }
        }
        System.out.println(result);
    }
```
}