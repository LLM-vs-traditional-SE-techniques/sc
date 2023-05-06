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


public class CodexTest_0_8_34 { 
  @Test
    public void testListContains() {
			List list = new ArrayList();
			assertFalse(list.contains(null));
			assertFalse(list.contains(new Object()));
			List list2 = new ArrayList();
			list2.add(null);
			list2.add(new Object());
			assertFalse(list.contains(list2));
		}
}