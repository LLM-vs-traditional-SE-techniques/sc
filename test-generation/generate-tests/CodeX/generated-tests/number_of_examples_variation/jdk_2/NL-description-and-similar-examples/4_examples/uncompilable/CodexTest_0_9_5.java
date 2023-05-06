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


public class CodexTest_0_9_5 { 
      @Test
      public void shouldReturnTrueIfTheListContainsPassedElement(){
        Random r = new Random();
        int   random = r.nextInt(100);
        boolean doesListContainsIt = smth.contains(random);
        assertTrue(doesListContainsIt);
      }
}