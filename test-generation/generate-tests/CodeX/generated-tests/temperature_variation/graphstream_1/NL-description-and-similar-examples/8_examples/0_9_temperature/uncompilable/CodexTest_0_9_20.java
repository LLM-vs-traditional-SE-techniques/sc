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


public class CodexTest_0_9_20 { 
  @Test
  public void testContains_shouldReturnTrueIfEdgeIsContainedInThisPath() {
        // setup
        PathTypeDescriptor underTest = new PathTypeDescriptor();
        Mockito.when(edgePath.contains(edge)).thenReturn(true);
        // when
        boolean result = underTest.contains(edge, null);
        // then
        assertTrue("contains should return true if edge is contained in this path", result);
}
}