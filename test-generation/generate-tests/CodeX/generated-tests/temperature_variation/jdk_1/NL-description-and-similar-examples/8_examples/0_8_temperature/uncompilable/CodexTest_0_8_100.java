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


public class CodexTest_0_8_100 { 
  @Test
  public void testRemove() {
        final ArrayList<Integer> list = new ArrayList<>();
        Objects.checkIndex(0, 0);
        final Object o1 = list.remove(0);
        fail("should have thrown IndexOutOfBoundsException");
    }
}
}