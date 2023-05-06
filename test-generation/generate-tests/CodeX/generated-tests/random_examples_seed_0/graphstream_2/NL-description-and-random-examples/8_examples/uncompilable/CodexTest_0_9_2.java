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


public class CodexTest_0_9_2 { 
  @Test
    public void testEqualsMethodInPathNodeClass() {
        PathNode p1 = new PathNode(mock(RelationshipType.class), "label");
        PathNode p2 = new PathNode(mock(RelationshipType.class), "label");
        assertTrue(p1.equals(p2));
    }
}