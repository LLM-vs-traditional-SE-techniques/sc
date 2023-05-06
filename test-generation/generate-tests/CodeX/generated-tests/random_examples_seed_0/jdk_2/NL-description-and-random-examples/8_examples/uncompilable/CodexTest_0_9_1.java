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


public class CodexTest_0_9_1 { 
     @Test
     public void isOfType_shouldReturnTrueBasedOnTheResult() {
         for (int i = 0; i < 10; i++) {
             if (i % 2 == 0) {
                 assertTrue(instanceOf(Integer.valueOf(i), Integer.class));
                 assertTrue(instanceOf(Double.valueOf(i), Double.class));
             } else {
                 assertFalse(instanceOf(Integer.valueOf(i), Integer.class));
                 assertFalse(instanceOf(Double.valueOf(i), Double.class));
             }
         }
     }
}