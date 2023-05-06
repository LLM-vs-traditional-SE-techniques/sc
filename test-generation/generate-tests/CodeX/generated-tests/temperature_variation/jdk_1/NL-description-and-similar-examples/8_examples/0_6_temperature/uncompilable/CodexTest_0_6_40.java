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


public class CodexTest_0_6_40 { 
  @Test
     public void testRemove() {
			AlgVector v = new AlgVector(4);
			v.setElement(0, 11);
			v.setElement(1, 22);
			v.setElement(2, 33);
			v.setElement(3, 44);
			assertEquals("1. element wrong", 11, v.getElement(0), 1.0e-12);
			assertEquals("2. element wrong", 22, v.getElement(1), 1.0e-12);
			assertEquals("3. element wrong", 33, v.getElement(2), 1.0e-12);
			assertEquals("4. element wrong", 44, v.getElement(3), 1.0e-12);
			assertEquals("length differs", 4, v.numElements());
			v.remove(1);
			assertEquals("1. element wrong", 11, v.getElement(0), 1.0e-12);
			assertEquals("3. element wrong", 33, v.getElement(1), 1.0e-12);
			assertEquals("4. element wrong", 44, v.getElement(2), 1.0e-12);
			assertEquals("length differs", 3, v.numElements());
		}
}