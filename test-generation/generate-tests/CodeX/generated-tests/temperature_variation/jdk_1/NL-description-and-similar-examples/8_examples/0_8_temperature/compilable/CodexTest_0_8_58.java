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


public class CodexTest_0_8_58 { 
  @Test
    public void testRemove() {
		Vector<Object> v = new Vector<Object>();
		v.add(new Object());
		v.add(new Object());
		Object obj = new Object();
		v.add(obj);
		assertSame(v.remove(2), obj);
		assertTrue(v.size() == 2);
	}
}