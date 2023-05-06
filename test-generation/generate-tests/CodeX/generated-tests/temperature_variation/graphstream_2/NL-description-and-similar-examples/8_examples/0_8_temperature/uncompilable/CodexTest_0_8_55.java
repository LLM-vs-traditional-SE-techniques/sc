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


public class CodexTest_0_8_55 { 
    @Test(expected = IllegalArgumentException.class)
    public void add_nodeTailMustBeInEdge() {
        Graph graph = createSimpleGraph();
        Path path = new Path();
        path.setRoot(graph.getNode("a"));
        path.add(graph.getEdge("ab"));
        // this has to fail as there is no edge between nodes b and a
        path.add(graph.getEdge("ba"));
    }
}