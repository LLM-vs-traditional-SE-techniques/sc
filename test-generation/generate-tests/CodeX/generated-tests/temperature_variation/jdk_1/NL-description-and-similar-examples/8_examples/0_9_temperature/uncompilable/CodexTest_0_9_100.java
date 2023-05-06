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


public class CodexTest_0_9_100 { 
  @Test
  public void testRemove() {
		XList<String> l = newArrayList("A", "B", "C", "D", "E");
		A.remove(2);
		assertEquals(newArrayList("A", "B", "D", "E"), l);
		assertEquals(newArrayList("A", "B", "C", "D", "E"),
				l.getAddHistory());
		assertEquals(newArrayList(2), l.getRemoveHistory());
	  }
}