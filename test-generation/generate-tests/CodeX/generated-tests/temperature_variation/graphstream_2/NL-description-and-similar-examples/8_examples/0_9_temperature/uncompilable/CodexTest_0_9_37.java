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


public class CodexTest_0_9_37 { 
        @Test
        public void equals() {
            Path p = new Path();
            Graph traversableGraph = createGraphForTraversalPathTest();
            p.setRoot(traversableGraph.getNode(A));
            p.add(traversableGraph.getEdge(AB));
            p.add(traversableGraph.getEdge(BC));
            p.add(traversableGraph.getEdge(CD));
}