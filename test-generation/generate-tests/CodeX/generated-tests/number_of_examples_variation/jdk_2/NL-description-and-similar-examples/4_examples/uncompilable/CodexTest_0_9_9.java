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


public class CodexTest_0_9_9 { 
  @Test
    public void testContainsShouldReturnFalseGivenTheListIsEmpty() {
        // given
        UniqueList uniqueList = new UniqueList();
        // when
        boolean actualResult = uniqueList.contains(-1);
        // then
        assertFalse(actualResult);
    }
	
Input: public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
Output:
    public void testContainsShouldReturnFalseGivenObjectIsNoTypeOfVersion() {
        // given
        UniqueList uniqueList = new UniqueList();
        // when
        boolean actualResult = uniqueList.contains(1);
        // then
        assertFalse(actualResult);
    }
}