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


public class CodexTest_0_9_93 { 
  @Test
    public void equals_shouldBeTrueIfEqual() {
        // given
        Path path = new Path(new Node[]{node1, node2, node3});
        Path p = new Path(new Node[]{node1, node2, node3});
        // expect
        assertTrue(path.equals(p));
    }
}