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


public class CodexTest_0_8_40 { 
  @Test
  public void testAddAll_threshold() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < ArrayList.DEFAULT_INITIAL_CAPACITY - 2; ++i) {
      list.add(i);
    }
    list.add(ArrayList.DEFAULT_INITIAL_CAPACITY - 2, 0);
    list.add(ArrayList.DEFAULT_INITIAL_CAPACITY - 1, 0);
}