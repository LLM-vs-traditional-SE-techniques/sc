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


public class CodexTest_0_8_5 { 
     @Test(timeout = 1000)
     public void remove() {
         // test remove(int index)
         FastArrayList<Integer> fal = new FastArrayList<Integer>();
         Integer i1 = 9;
         Integer i2 = 8;
         Integer i3 = 7;
         fal.add(i1);
         fal.add(i2);
         fal.add(i3);
         assertEquals("remove(1) did not remove the second element", i2, fal.remove(1));
         assertEquals("size() does not return the correct number of elements", 2, fal.size());
         assertEquals("remove(0) did not remove the first element", i1, fal.remove(0));
         assertEquals("size() does not return the correct number of elements", 1, fal.size());
     }
}