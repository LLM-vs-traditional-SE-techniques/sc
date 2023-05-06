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
    public void testRemove() {
          for( int i=0; i<4; i++ ) {
              for( int j=0; j<4; j++ ) {
                  final IndexList aList = new IndexList();
                  aList.add(i,0,"11");
                  aList.remove(i,1);
                  aList.remove(i,0);
              }
}