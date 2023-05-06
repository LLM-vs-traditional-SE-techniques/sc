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


public class CodexTest_0_8_57 { 
    @Test
    public void equals_falseIfNodePathsAreDifferent() {
        Graph graph = createSimpleGraph();
        Path pathA = new Path();
        pathA.setRoot(graph.getNode(a));
        pathA.add(graph.getEdge(ab));
        pathA.add(graph.getEdge(bc));
        Path pathB = new Path();
        pathB.setRoot(graph.getNode(a));
        // this is the difference
        pathB.add(graph.getEdge(ac));
        pathB.add(graph.getEdge(cg));
        assertFalse(pathA.equals(pathB));
    }

}