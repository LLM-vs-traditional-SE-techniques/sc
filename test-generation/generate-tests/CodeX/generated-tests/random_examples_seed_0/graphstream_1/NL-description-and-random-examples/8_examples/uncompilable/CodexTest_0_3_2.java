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


public class CodexTest_0_3_2 { 
  @Test
    public void testContains() {
        // given
        EdgePath edgePath = new EdgePath();
        Edge edge = new Edge(new Node(1), new Node(2));
        edgePath.add(edge);
        // when
        boolean result = edgePath.contains(edge);
        // then
        assertTrue(result);
    }
}