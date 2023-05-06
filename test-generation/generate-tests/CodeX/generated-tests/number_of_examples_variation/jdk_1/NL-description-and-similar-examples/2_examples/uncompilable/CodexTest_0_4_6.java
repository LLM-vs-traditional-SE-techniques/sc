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


public class CodexTest_0_4_6 { 
  @Test
    public void testRemove() {
        int size = 10;
        for (int i=0; i<size; i++) {
            list.add(Integer.toString(i));
        }
        for (int i=0; i<size; i++) {
            assertEquals(Integer.toString(i), list.remove(0));
        }
    }
}