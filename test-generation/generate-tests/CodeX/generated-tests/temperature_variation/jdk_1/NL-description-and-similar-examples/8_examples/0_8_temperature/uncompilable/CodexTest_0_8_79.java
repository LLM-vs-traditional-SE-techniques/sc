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


public class CodexTest_0_8_79 { 
  @Test
       public void testCheckIndex() {
			Object[] elements = {new Object(),new Object(),new Object()};
			Object o = Objects.checkIndex(1, elements.length);
			Assert.assertEquals(elements[1], o);
			// try bad index
			Objects.checkIndex(3, elements.length);
			
		}
}