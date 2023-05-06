import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_52 { 
  @Test
  public void testAllElementsIn() {
    List<Integer> empty = new ArrayList<Integer>();
    assertFalse(BioJavaHelper.allElementsIn(empty, 42));
    Integer[] nonEmpty = new Integer[] { 42 };
    assertFalse(BioJavaHelper.allElementsIn(empty, 42));
    assertTrue(BioJavaHelper.allElementsIn(nonEmpty, 42));
    assertTrue(BioJavaHelper.allElementsIn(list(42, 42), 42));
    assertTrue(BioJavaHelper.allElementsIn(list(42, 43), 42, 43));
    assertFalse(BioJavaHelper.allElementsIn(list(42, 43, 43), 42, 44));
  }
}