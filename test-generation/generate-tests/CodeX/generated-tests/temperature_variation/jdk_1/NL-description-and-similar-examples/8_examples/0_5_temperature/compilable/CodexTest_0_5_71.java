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


public class CodexTest_0_5_71 { 
  @Test
    public void testIndexOutOfBoundsException() {
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			list.add(new Object());
			try {
				list.remove(8);
				fail("Should throw IndexOutOfBoundsException");
			} catch (IndexOutOfBoundsException e) {
				// Expected
			}
		}
}