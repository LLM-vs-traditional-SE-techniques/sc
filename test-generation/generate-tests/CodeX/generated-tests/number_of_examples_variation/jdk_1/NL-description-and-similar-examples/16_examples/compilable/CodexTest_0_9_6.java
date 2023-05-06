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


public class CodexTest_0_9_6 { 
  @Test
   public void testArrayListRemove() {
		ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
        	if (i >= 5) {
                al.add(i);
        	}
        }
        Integer x = al.remove(0);
        assertTrue(x.equals(5));
        assertTrue(al.size() == 94);
   }
}