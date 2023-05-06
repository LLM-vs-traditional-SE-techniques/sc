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


public class CodexTest_0_9_3 { 
  @Test
  public void testRemove() {
        E element = list.get(0);
        E removed = list.remove(0);
        evidence.assertEquals("Wrong element removed", element, removed);
        evidence.assertEquals("List should be empty", 0, list.size());
  }
}