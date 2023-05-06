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


public class CodexTest_0_8_75 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int nextId = random.nextInt(100000);
            list.add(nextId);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            assertTrue("failed to remove",list.size() == 99999 - i);
        }
        System.out.println("remove took : " + (System.nanoTime() - startTime) + " nanoseconds\n");
    }
}