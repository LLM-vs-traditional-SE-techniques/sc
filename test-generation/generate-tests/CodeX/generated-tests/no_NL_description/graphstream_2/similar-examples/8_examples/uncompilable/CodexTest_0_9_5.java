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


public class CodexTest_0_9_5 { 
  @Test
    assertEquals("Number of edges differs: ", Arrays.asList(edges).size(), path.size());
        for (int i = 0; i < Arrays.asList(edges).size(); i++) {
            assertEquals("Edges differ: ", Arrays.asList(edges).get(i), path.get(i));
        }
}