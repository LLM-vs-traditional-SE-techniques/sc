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


public class CodexTest_0_9_4 { 
    @Test
    public void containsShouldReturnTrueWhenEdgeGiven() {
        // given
        Path path = new Path();
        path.nodePath = getNodePath();
        path.edgePath = getEdgePath();
        Edge edge = Edge.from("start");
        Edge edge2 = Edge.from("end");
        path.edgePath.add(edge);
        path.edgePath.add(edge2);
        // when
        boolean result = path.contains(edge2);
        // then
        assertTrue(result);
    }
}