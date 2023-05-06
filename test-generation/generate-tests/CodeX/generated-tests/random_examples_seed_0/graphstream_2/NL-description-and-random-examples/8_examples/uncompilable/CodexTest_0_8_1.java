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


public class CodexTest_0_8_1 { 
  @Test
  public void testPathEqualsMethod() {
        Path path1 = new Path(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        Path path2 = new Path(Arrays.asList(1,2,3), Arrays.asList(1,2,3));
        assertTrue(path1.equals(path2));
    }
}