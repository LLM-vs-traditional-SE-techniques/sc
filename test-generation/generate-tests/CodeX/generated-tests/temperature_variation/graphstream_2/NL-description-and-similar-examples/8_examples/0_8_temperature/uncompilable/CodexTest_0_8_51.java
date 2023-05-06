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


public class CodexTest_0_8_51 { 
  @Test
    public void testTestEqualsMethodBetweenPathWithEdge() throws InstantiationException, IllegalAccessException {
        Graph graph = createSimpleGraph();
        Path patha = new Path();
        Path pathb = new Path();
        patha.setRoot(graph.getNode(a));
        pathb.setRoot(graph.getNode(a));
        patha.add(graph.getEdge(ab));
        pathb.add(graph.getEdge(ab));
        boolean result = patha.equals(pathb);
        assertTrue(result);
    }

}