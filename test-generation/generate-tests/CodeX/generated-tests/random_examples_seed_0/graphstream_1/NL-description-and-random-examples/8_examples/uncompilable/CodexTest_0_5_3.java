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


public class CodexTest_0_5_3 { 
    /**
     * This test checks the method contains(Edge edge)
     *
     * @see #contains(Edge edge)
     * @verifies return true if the edge is in the edgePath
     * @verifies return false if the edge is not in the edgePath
     */
    @Test
    public void contains_shouldReturnTrueIfTheEdgeIsInTheEdgePath() throws Exception {
        Edge edge = new Edge(new Vertex("A"), new Vertex("B"));
        EdgePath edgePath = new EdgePath(edge);
        assertTrue(edgePath.contains(edge));
        assertFalse(edgePath.contains(new Edge(new Vertex("C"), new Vertex("D"))));
}