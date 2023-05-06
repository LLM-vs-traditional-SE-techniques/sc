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


public class CodexTest_0_9_7 { 
  @Test
    public void testEquals() {
        final List<Node> nodes1 = Arrays.asList(
            createSimpleGraph().getNode(a),
            createSimpleGraph().getNode(b),
            createSimpleGraph().getNode(c),
            createSimpleGraph().getNode(d)
        );
}