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


public class CodexTest_0_7_7 { 
  @Test
    public void testRemoveShouldRemoveFromMiddle() {
        // given
        ArrayList<String> underTest = createArrayListWithValues("a", "b", "c");
        // when
        String result = underTest.remove(1);
        // then
        Assertions.assertThat(result).isEqualTo("b");
        Assertions.assertThat(underTest).containsExactly("a", "c");
    }
}