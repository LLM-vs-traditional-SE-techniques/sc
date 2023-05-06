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


public class CodexTest_0_9_10 { 
  @Test
    public void testRemoveSingleElementAtSmallerIndices() {
        ArrayList<Integer> list = setUpArrayList();
        for (int i = 0; i <= SIZE/2; i++) {
            testRemoveElementBoundary(list, i);
            list.clear();
            list.addAll(setUpArrayList());
        }
    }
}