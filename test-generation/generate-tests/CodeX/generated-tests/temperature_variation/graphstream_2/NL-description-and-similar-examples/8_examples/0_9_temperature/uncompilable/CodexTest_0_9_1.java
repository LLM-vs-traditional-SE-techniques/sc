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


public class CodexTest_0_9_1 { 
  @Test
         public void testTraverseNodePath() throws Exception {
        String input = "Digraph g {\n" +
                "node [fontsize=8, height=.1, width=.1 margin=\"0.02,0.01\"]; " +
                "a; b; a -> b;\n b ->a;}";
        // use this DOT data for testing.
        NodePath expected = NodePath.parse("a b");
}