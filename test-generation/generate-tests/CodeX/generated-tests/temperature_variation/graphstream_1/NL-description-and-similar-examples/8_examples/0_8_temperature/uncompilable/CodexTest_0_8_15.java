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


public class CodexTest_0_8_15 { 
    @Test
    public void contains_whenEdgePathContainsSameEdge_thenTrueReturned() {
        // given
        Path path = new Path();
        path.edgePath = new ArrayList<>(Arrays.asList(new Edge[]{
                new Edge(new Node("a"), new Node("b"), 9),
                new Edge(new Node("b"), new Node("a"), 9)
        }));
}