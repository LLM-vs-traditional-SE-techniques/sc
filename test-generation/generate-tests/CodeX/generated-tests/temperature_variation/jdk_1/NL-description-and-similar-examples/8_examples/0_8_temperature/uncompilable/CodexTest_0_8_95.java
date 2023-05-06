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


public class CodexTest_0_8_95 { 
  @Test
  public void testRemove() {
        Object[] a = CollectionData.array(new A[]{
                new A(1), new A(2), new A(3),
                new A(4), new A(5), new A(6),
                new A(7), new A(8),
        });
        List list = new ArrayList(Arrays.asList(a));
}