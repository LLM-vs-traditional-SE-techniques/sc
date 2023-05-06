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


public class CodexTest_0_5_2 { 
  @Test
    
Input: public static <T> ImmutableSet<T> of(T element) {
        return new RegularImmutableSet<T>(element);
      }
Output: public void testOf() {
			ImmutableSet<String> set = ImmutableSet.of("one");
			assertThat(set).containsExactly("one").inOrder();
		  }
}