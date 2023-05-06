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


public class CodexTest_0_8_3 { 
  @Test
      public void remove_int() {
        doReturn(-1).when(mList).checkIndex(5, 5);
        assertEquals(-1, mList.remove(5));        
      }
      public void remove_int() {
        doReturn(5).when(mList).checkIndex(5, 5);
        mList.remove(5);
        verify(mList).fastRemove(elementData, 5);
      }
}